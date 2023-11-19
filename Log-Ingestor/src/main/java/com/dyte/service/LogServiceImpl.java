package com.dyte.service;

import com.dyte.exception.LogException;
import com.dyte.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dyte.repository.LogRepository;

import java.util.List;


@Service
public class LogServiceImpl implements LogService{

    @Autowired
    private LogRepository lr;

    @Override
    public Log createLog(Log log) {

        return lr.save(log);
    }

    @Override
    public List<Log> filterByLevel(String level) throws LogException {


       List<Log> list =  lr.findByLevel(level);

       if(list.isEmpty()) throw  new LogException("There is no level record");

       else return list;

    }

    @Override
    public List<Log> filterByMessage(String message) throws LogException {


        List<Log> list =  lr.findByMessage(message);

        if(list.isEmpty()) throw  new LogException("There is no level record");

        else return list;
    }

    @Override
    public List<Log> filterByResourceId(String resourceId) throws LogException {

        List<Log> list =  lr.findByResourceId(resourceId);

        if(list.isEmpty()) throw  new LogException("There is no resourceId record");

        else return list;
    }

    @Override
    public List<Log> filterByTraceId(String traceId) throws LogException {

        List<Log> list =  lr.findByTraceId(traceId);

        if(list.isEmpty()) throw  new LogException("There is no traceId record");

        else return list;
    }

    @Override
    public List<Log> filterBySpanId(String spanId) throws LogException {

        List<Log> list =  lr.findBySpanId(spanId);

        if(list.isEmpty()) throw  new LogException("There is no spanId record");

        else return list;
    }

    @Override
    public List<Log> filterByCommit(String commit) throws LogException {

        List<Log> list =  lr.findByCommit(commit);

        if(list.isEmpty()) throw  new LogException("There is no commit record");

        else return list;
    }


}
