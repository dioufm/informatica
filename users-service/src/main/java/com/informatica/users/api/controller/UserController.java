package com.informatica.users.api.controller;

import com.informatica.users.api.model.Document;
import com.informatica.users.api.model.User;
import com.informatica.users.api.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

@Data
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    private final WebClient.Builder webClientBuilder;

    public UserController(UserRepository userRepository, WebClient.Builder webClientBuilder) {
        this.userRepository = userRepository;
        this.webClientBuilder = webClientBuilder;
    }

    @GetMapping("/users")
    public Iterable<User> findAllEmployees() {
        return this.userRepository.findAll();
    }

    @PostMapping("/users")
    public User addOneEmployee(@RequestBody User employee) {
        return this.userRepository.save(employee);
    }

    @GetMapping("/document")
    public Document getDocument(){
        return webClientBuilder.build().get().uri("http://CATALOGUE-SERVICE/catalogue/document")
                .retrieve().bodyToMono(Document.class).block();
    }
}
