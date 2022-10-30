package br.study.appcontainer.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${test.user.name}")
    private String userName;

    @Value("${test.user.age}")
    private String userAge;

    @Value("${test.list}")
    private String listFruits;

    @Value("${test.secret}")
    private String verySecretAny;

    @Value("${test.server}")
    private String serverInfo;

    @Value("${test.port}")
    private String portInfo;

    @GetMapping
    public String index() {
        return "Api main";
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }

    @GetMapping("/message/{name}")
    public String getName(@PathVariable String name) {
        return "Welcome %s !!!!".formatted(name);
    }

    @GetMapping("/env")
    public String getEnv() {
        return "User : " + userName + " | Age : " + userAge;
    }

    @GetMapping("/my-list")
    public String getList(){
        return listFruits;
    }

    @GetMapping("/my-secret")
    public String getVerySecret(){
        return verySecretAny;
    }

    @GetMapping("/server-info")
    public String getServerInfo() { return serverInfo +":"+ portInfo; }





}
