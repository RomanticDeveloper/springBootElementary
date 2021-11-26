package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController //해당 class 는 REST API 를 처리하는 Controller
@RequestMapping("/get") // request mapping URI를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello") //http://localhost:9090/api/hello
    public String hello(){
        return "hello string boot";

    }

    @RequestMapping(path = "hi", method = RequestMethod.GET) //get 에 한정하여 동작하도록 지정 http://localhost:9090/api/get/hit
    public String hi(){
        return "hi";

    }

    //

    @GetMapping(path = "/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pahtName){
        System.out.println("PathVaribale : " + pahtName);
        return "";
    }

    @GetMapping(path = "query-param")
    public String qeryParame(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry ->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("");

            sb.append(entry.getKey() + "=" + entry.getValue() +"\n");
        });
        return sb.toString();
    }

    // http://localhost:9090/api/get/query-params?user=steve&email=steve@gmail.com&age=30

    @GetMapping("query-param02")
    public String queryParam02(@RequestParam String name,
                               @RequestParam String email,
                               @RequestParam int age){

        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){

        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }




}
