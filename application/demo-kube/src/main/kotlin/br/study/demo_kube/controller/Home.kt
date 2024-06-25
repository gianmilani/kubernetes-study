package br.study.demo_kube.controller

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
<<<<<<< HEAD
import java.util.Random
=======
import java.time.LocalTime
>>>>>>> 586944c (added livenessProbe)

@RestController
@RequestMapping("/home")
class Home(
    @Value("\${app.name}")
    private val appName: String,
    @Value("\${app.info}")
    private val appInfo: String,
    @Value("\${app.test_sc}")
    private val testSc: String
) {
    private var log = LoggerFactory.getLogger(this::class.java)
    private val timeStart = LocalTime.now().plusSeconds(10)

    @GetMapping
    fun welcome() = "Hello, welcome v2"

    @GetMapping("/show")
    fun showVariables() = "AppName= $appName | AppInfo= $appInfo"

    @GetMapping("/exec")
    fun showInfoSec() = log.info("Show info sec {}", testSc)

    @GetMapping("/healthCheck")
    fun health(): String {
<<<<<<< HEAD
        val nextInt = Random().nextInt(1, 100)
        if(nextInt > 50) throw RuntimeException("Application with problem")
=======
        if(LocalTime.now() < timeStart) throw RuntimeException("application error")
>>>>>>> 586944c (added livenessProbe)
        return "OK"
    }
}