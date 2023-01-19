# Cyber Resilience Repository

Welcome to the Cyber Resilience Repository. This repository contains the following samples:

## Part 1 - Resilience4j Starter

[Resilience4j](/resilience4j)

### Setup

After cloning change to the resilience4j folder

`cd resilience4j`

and type

`gradle run`

to start the resilience4j sample application.

The sample application introduces the Retry module and configures a (simple) retry setup.

### Resilience4j in Action

Adapt the Resilience4j application to one of the supported resilience use case. Choose among:

- CircuitBraker
- Bulkhead
- RateLimiter
- TimeLimiter
- Cache

and experiment with these modules.
Ideally, each group implements a *different* use case to maximize the showcase for all other participants in the workshop.

## Part 2 - Micronaut Starter

[Micronaut Starter](/micronaut/)

### Setup

After cloning change to the micronaut folder

`cd micronaut`

and type

`gradle run`

to start the micronaut sample application.

The sample application starts a Micronaut application instance and is prepared to be deployed on [Azure Functions](https://learn.microsoft.com/en-us/azure/azure-functions/functions-overview).

### Micronaut on Azure Functions

Adapt the Micronaut application to the chosen resilience module from part 1. Try to start a (small) set of micronaut applications on different azure functions and show case the benefit of resilience in the azure cloud.

### Hint

Micronaut and Azure Functions are strictly optional and just a suggestion. If you are familiar with other frameworks (Spring Boot, vert.x, etc.) and/or other cloud environments (AWS or Google Cloud) feel free to adapt this use case to your preferred stack.
The main aim of this workshop is to show case resilience on PaaS offers, not to market Azure cloud (or Micronaut).

#### Resources
https://micronaut.io/2020/05/15/micronaut-now-supports-microsoft-azure-functions/ 