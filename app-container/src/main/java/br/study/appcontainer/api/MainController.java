package br.study.appcontainer.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String index() {
        return "Api main";
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }

    @GetMapping("/message/{name}")
    public String getName(@PathVariable String name){
        return "Welcome %s !!!!".formatted(name);
    }
}
