package com.informatica.catalogue.api.repository;

import com.informatica.catalogue.api.model.Lesson;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LessonRepository extends MongoRepository<Lesson, String> {

    @Query("{name:'?0'}")
    Lesson findItemByName(String name);

    List<Lesson> findAll();

    public long count();

}
