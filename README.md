# Spring Boot 3.x security (Spring 6) using JWT token for authorization in microservices (access resources via API-GATEWAY) : SwiggyDemo

- Register yourself in identity-server (Auth-server) using port 9898, which is access to all. (But first, ensure you have MySQL schema, "securityTest" at port 3306)
- Generate jwtToken now, in order to access our swiggy/restaurant miscroservices. You can generate token only if you've registered yourself (it'll verify from db data).
- Now in case in you want, you can validate your token as well.
- Once, you've ensured you've sucessfully got token, you can hit our resources (swiggy/restaurant miscroservices) via API-Gateway (it has default 8080 port).

![](https://github.com/AadityaUoHyd/springboot3security_with_jwt_microservices_swiggyDemo/blob/master/Microservices%20Security%20Using%20JWT%20_%20Spring%20Cloud%20Gateway%20_%20JavaTechie%20-%20YouTube%20-%20Brave%2002-04-2023%2000_07_35.png)

- Go inside folder in order to find, more details.
