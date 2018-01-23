package com.secl.marjan.univerge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("api")
@Controller
public class WordCountController {
    @Autowired
    private WordCount wordCount;
    @RequestMapping("wordcount")
    public ResponseEntity<List<Count>> words(){
        return new ResponseEntity<>(wordCount.count(), HttpStatus.OK);
    }
}
