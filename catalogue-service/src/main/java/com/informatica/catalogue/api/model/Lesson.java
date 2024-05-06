package com.informatica.catalogue.api.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document("lesson")
public class Lesson {

    @Id
    private String id;
    private String name;
    private String category;

    public Lesson(String name, String category) {
        this.name = name;
        this.category = category;
    }
}