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
