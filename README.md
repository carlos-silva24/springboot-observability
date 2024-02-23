# Springboot Observability

Using micrometer for tracing and metrics works fine using spring-web but if we are using jersey/apache cxf we are not able to get traces correctly

## Getting Started

1. Go to the .docker folder and run: **docker compose up -d**
2. Start the application
3. curl http://localhost:8000/v1/my-resources/1

## Problem
1. Go to http://localhost:8006/ and see that the metric **http_server_requests_milliseconds_count** is defined correctly (we can see the URI option)
2. Open the ot-collector container logs and see that no Traces are being exported
   - if we enable spring-web dependency (**implementation 'org.springframework.boot:spring-boot-starter-web'**) we get traces but the URI is unknown (however http.url is correct: /v1/my-resources/1)

Since URI is unknown the trace Name is not very useful (open http://localhost:8005/) and see the tracing dashboard

