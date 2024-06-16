package br.study.demo_kube.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class Home {

    @GetMapping
    fun welcome() = "Hello, welcome v2"
}