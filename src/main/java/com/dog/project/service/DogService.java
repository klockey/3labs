package com.dog.project.service;

import com.dog.project.labs.entity.Dog;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DogService {

       List<String> retrieveDogsNames();
       List<String> retrieveDogsBreed();
       String retrieveDogByID(Long id);

}
