package dev.sherin.weatherDemoDiscovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class WeatherDemoDiscoveryApplication

fun main(args: Array<String>) {
	runApplication<WeatherDemoDiscoveryApplication>(*args)
}
