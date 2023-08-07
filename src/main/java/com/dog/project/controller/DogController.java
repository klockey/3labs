package com.dog.project.controller;

import com.dog.project.service.DogService;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users1")
public class DogController {

    @Autowired
    private DogService dogService;

//    @GetMapping("/example")
//    public ResponseEntity exampleHeaders() {
//        HttpHeaders responseHeaders = new HttpHeaders();
//        responseHeaders.set("technicalsand-Example-Header", "https://technicalsand.com");
//        return ResponseEntity();
//    }


    @GetMapping("/users1")
    @ResponseBody
    public List < String > users1() {
        List < String > users = new ArrayList <String > ();
        users.add(new String ("Ramesh"));
        users.add(new String("Tony"));
        users.add(new String("Tom"));
        return users;
    }




    @GetMapping("/dogs")
   public List<String> getDogNames() {
       // List<String> list = dogService.retrieveDogsNames();

        List<String> list = new ArrayList<>();

        list.add("keith");

        return new ResponseEntity<List<String>>(list, HttpStatus.OK).getBody();
    }
//
//    public List<String> getDogNames() {
//        // List<String> list = dogService.retrieveDogsNames();
//
//        List<String> list = new ArrayList<>();
//
//        list.add("keith");
//        return list;
//    }



//    @GetMapping("/dogs/name")
//    public void print() {
//        System.out.println("here");
//    }

}
