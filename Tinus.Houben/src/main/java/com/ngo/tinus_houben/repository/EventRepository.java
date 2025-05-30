package com.ngo.tinus_houben.repository;

import com.ngo.tinus_houben.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findTop10ByOrderByTimeDesc();
}
