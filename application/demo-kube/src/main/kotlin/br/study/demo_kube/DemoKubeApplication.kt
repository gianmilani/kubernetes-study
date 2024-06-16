package br.study.demo_kube

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoKubeApplication

fun main(args: Array<String>) {
	runApplication<DemoKubeApplication>(*args)
}
