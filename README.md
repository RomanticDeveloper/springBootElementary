# helloSpring

> 프로젝트명 : 스프링 기초 연습 (FastCampus)
> 시작일자 : 2021.11.27
> 작성자 : Ro.D



1. Query Param 을 묵시적으로 받는 경우 , "Map  < String, String >" 을 통해 받을 수 있고, 명시적으로 받는 경우에는 @RequestParma 어노테이션을 활용해서 @RequestParam name 등으로 받아 올 수 있음

2. Dto 에서 객체를 만들어서 받아오는 경우에는 @RequestParam 을 사용하지 않아도 객체를 받아올 수 있다.
1) UserReqest 객체 생성후 queryParam(UserRequest userRequest) 이와같은 형태로 userRequest 를 만들 수 있다.




