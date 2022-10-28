package br.study.appcontainer.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${user.name}")
    private String userName;

    @Value("${user.age}")
    private String userAge;

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

    @GetMapping("/env")
    public  String getEnv(){
        return "User : " + userName + " | Age : " + userAge;
    }
}
