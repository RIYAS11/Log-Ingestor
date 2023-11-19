package com.dyte.controller;

import com.dyte.model.Log;
import com.dyte.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LogController {

    @Autowired
    private LogService logService;


    @PostMapping("/createlog")
    public ResponseEntity<Log> createlog(@RequestBody Log log){

        System.out.println(log);
           Log mineLog =  logService.createLog(log);

           return new ResponseEntity<Log>(log , HttpStatus.ACCEPTED);
    }

    @GetMapping("/filter/level/{level}")
    public ResponseEntity<List<Log>> filterLevel(@PathVariable("level") String level){

        List<Log> list = logService.filterByLevel(level);

        return new ResponseEntity<>(list , HttpStatus.OK);
    }

    @GetMapping("/filter/message/{message}")
    public ResponseEntity<List<Log>> filterMessage(@PathVariable("message") String message){

        List<Log> list = logService.filterByMessage(message);

        return new ResponseEntity<>(list , HttpStatus.OK);
    }

    @GetMapping("/filter/resourceId/{resourceId}")
    public ResponseEntity<List<Log>> filterResourceId(@PathVariable("resourceId") String resourceId){

        List<Log> list = logService.filterByResourceId(resourceId);

        return new ResponseEntity<>(list , HttpStatus.OK);
    }

    @GetMapping("/filter/traceId/{traceId}")
    public ResponseEntity<List<Log>> filterTraceId(@PathVariable("traceId") String traceId){

        List<Log> list = logService.filterByTraceId(traceId);

        return new ResponseEntity<>(list , HttpStatus.OK);
    }


    @GetMapping("/filter/spanId/{spanId}")
    public ResponseEntity<List<Log>> filterSpanId(@PathVariable("spanId") String spanId){

        List<Log> list = logService.filterBySpanId(spanId);

        return new ResponseEntity<>(list , HttpStatus.OK);
    }

    @GetMapping("/filter/commit/{commit}")
    public ResponseEntity<List<Log>> filterCommit(@PathVariable("commit") String commit){

        List<Log> list = logService.filterByCommit(commit);

        return new ResponseEntity<>(list , HttpStatus.OK);
    }


}
