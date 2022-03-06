# springboot-microservices

This is a sample microservice project using Springboot and Spring Cloud

## Spring Cloud Projects
  * Spring cloud config server for configuration management
  * Feign is used as a REST Client
  * Netflix Eureka as naming server
  * Spring cloud loadbalancer as load balacing amoung microservies instance
  * Spring Cloud Gateway as a API gateway
  * Resilience4j  as a circuit breaker framework

## Ports

| Application                   | Ports            |
| ----------------------------- | --------------- |
| Limits Service                | 8080, 8081, ... |
| Spring Cloud Config Server    | 8888            |
| Currency Exchange Service     | 8000, 8001, ..  |
| Currency Conversion Service   | 8100, 8101, ..  |
| Netflix Eureka Naming Server  | 8761            |
| API Gateway Server            | 8765            |
