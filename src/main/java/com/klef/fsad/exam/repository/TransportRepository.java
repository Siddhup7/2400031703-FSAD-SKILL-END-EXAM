package com.klef.fsad.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.exam.model.Transport;

public interface TransportRepository extends JpaRepository<Transport, Integer>
{
}