package com.dyte.repository;

import com.dyte.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LogRepository  extends JpaRepository<Log , Integer> {

    public List<Log> findByLevel(String level);
    public List<Log> findByMessage(String message);
    public List<Log> findByResourceId(String resourceId);
    public List<Log> findByTraceId(String traceId);
    public List<Log> findBySpanId(String spanId);
    public List<Log> findByCommit(String commit);


}
