package com.dyte.service;

import com.dyte.exception.LogException;
import com.dyte.model.Log;

import java.util.List;

public interface LogService {

    public Log createLog(Log log);

    public List<Log> filterByLevel(String level) throws LogException;

    public List<Log> filterByMessage(String message) throws LogException;

    public List<Log> filterByResourceId(String resourceId) throws LogException;

    public List<Log> filterByTraceId(String traceId) throws LogException;

    public List<Log> filterBySpanId(String spanId) throws LogException;

    public List<Log> filterByCommit(String commit) throws LogException;



}
