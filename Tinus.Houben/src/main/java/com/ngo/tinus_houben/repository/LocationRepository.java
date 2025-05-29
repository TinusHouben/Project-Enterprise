package com.ngo.tinus_houben.repository;

import com.ngo.tinus_houben.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
