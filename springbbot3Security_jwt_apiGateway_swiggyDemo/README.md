# jwt-apigateway-security

## Regist an user

```
curl --location --request POST 'http://localhost:8080/auth/register' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=72CE91EE75A652377C0DCB6C6C5DF5D1' \
--data-raw '{
    "name":"Aadi",
    "password":"Pwd1",
    "email":"aadi@gmail.com"
}'

```

## Generate token

```
curl --location --request POST 'http://localhost:9898/auth/token' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=72CE91EE75A652377C0DCB6C6C5DF5D1' \
--data-raw '{
    "username":"Aadi",
    "password":"Pwd1"
}'
```
## Access Swiggy-app

```
curl --location --request GET 'http://localhost:8080/swiggy/90161al' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJBYWRpIiwiaWF0IjoxNjgwMzcyODY3LCJleHAiOjE2ODAzNzQ2Njd9.Vu8XF-5f9SOvE0oeYNL3eRod_Ub4OuaEbPP05MUt_dk' \
--header 'Cookie: JSESSIONID=72CE91EE75A652377C0DCB6C6C5DF5D1'
```

## Access Restaurant-service

```
curl --location --request GET 'http://localhost:8080/restaurant/orders/status/90161al' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJBYWRpIiwiaWF0IjoxNjgwMzcyODY3LCJleHAiOjE2ODAzNzQ2Njd9.Vu8XF-5f9SOvE0oeYNL3eRod_Ub4OuaEbPP05MUt_dk' \
--header 'Cookie: JSESSIONID=72CE91EE75A652377C0DCB6C6C5DF5D1'
```

- Register yourself in identity-server (Auth-server) using port 9898, which is access to all. (But first, ensure you have MySQL schema, "securityTest" at port 3306)
![](https://github.com/AadityaUoHyd/springboot3security_with_jwt_microservices_swiggyDemo/blob/master/springbbot3Security_jwt_apiGateway_swiggyDemo/addUserToDb.jpg)
 
- Generate jwtToken now, in order to access our swiggy/restaurant miscroservices. You can generate token only if you've registered yourself (it'll verify from db data).
![](https://github.com/AadityaUoHyd/springboot3security_with_jwt_microservices_swiggyDemo/blob/master/springbbot3Security_jwt_apiGateway_swiggyDemo/generate%20token.jpg)

- Now in case in you want, you can validate your token as well.
![](https://github.com/AadityaUoHyd/springboot3security_with_jwt_microservices_swiggyDemo/blob/master/springbbot3Security_jwt_apiGateway_swiggyDemo/verifyToken.jpg)

- Once, you've ensured you've sucessfully got token, you can hit our resources (swiggy/restaurant miscroservices) via API-Gateway (it has default 8080 port).
![](https://github.com/AadityaUoHyd/springboot3security_with_jwt_microservices_swiggyDemo/blob/master/springbbot3Security_jwt_apiGateway_swiggyDemo/Screenshot%202023-04-01%20235418.jpg)

![](https://github.com/AadityaUoHyd/springboot3security_with_jwt_microservices_swiggyDemo/blob/master/springbbot3Security_jwt_apiGateway_swiggyDemo/Screenshot%202023-04-01%20235418.jpg)
