package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class HelloConfig: WebMvcConfigurer {
    @Autowired
    lateinit var helloInterceptor: HelloInterceptor

    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(helloInterceptor)
    }
}