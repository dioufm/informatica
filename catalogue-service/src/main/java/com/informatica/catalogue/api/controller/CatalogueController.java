package com.informatica.catalogue.api.controller;

import com.informatica.catalogue.api.model.Lesson;
import com.informatica.catalogue.api.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalogue")
class CatalogueController {

    @Autowired
    private LessonRepository lessonRepository;

    @GetMapping("/")
    public String hello(){

        System.out.println("-----CREATE GROCERY ITEMS-----\n");

        lessonRepository.save(new Lesson("Modéle en Java11", "JAVA"));
        lessonRepository.save(new Lesson("Programmation en Java22", "JAVA"));

        System.out.println("\n-----SHOW ALL GROCERY ITEMS-----\n");

       lessonRepository.findAll().forEach(item -> System.out.println(item));

        return "hello Mongo";
    }

    @GetMapping("/documents")
    public Iterable<Lesson> findAllDocuments() {
        return this.lessonRepository.findAll();
    }

    @GetMapping("/document")
    public Lesson findFisrtDocuments() {
        return this.lessonRepository.findAll().get(0);
    }
}
