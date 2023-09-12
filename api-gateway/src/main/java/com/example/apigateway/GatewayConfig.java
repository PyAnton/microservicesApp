package com.example.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("test-route", r -> r
                        .path("/**")
                        .uri("lb://test-service"))
//                .route("another-route", r -> r
//                        .path("/another")
//                        .uri("lb://another-service"))
                .build();
    }
}
