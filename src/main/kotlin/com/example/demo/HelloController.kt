package com.example.demo

import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
class HelloController {

  val log = LoggerFactory.getLogger(HelloInterceptor::class.java)

  @GetMapping("/hello")
  fun hello(model: Model): Map<String, String> {
      log.info("/hello request")
      return mapOf("hi" to "hello")
  }
}