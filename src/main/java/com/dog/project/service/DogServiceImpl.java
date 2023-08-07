package com.dog.project.service;
import com.dog.project.labs.entity.Dog;
import com.dog.project.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    DogRepository dogRepository;

    @Override
    public List<String> retrieveDogsNames() {
        System.out.println("retrieve");

        return dogRepository.findAllName();
    }

    @Override
    public List<String> retrieveDogsBreed() {
        return  dogRepository.findAllBreed();
    }

    @Override
    public String retrieveDogByID(Long id) {
        return dogRepository.findBreedById(id);
    }

}
