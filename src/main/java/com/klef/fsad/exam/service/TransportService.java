package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Transport;
import com.klef.fsad.exam.repository.TransportRepository;

@Service
public class TransportService 
{
    @Autowired
    private TransportRepository repository;

    public Transport addTransport(Transport transport)
    {
        if(transport.getTransportId() == 0)
        {
            throw new RuntimeException("Transport ID must not be null or 0");
        }
        return repository.save(transport);
    }

    public String deleteTransport(int id)
    {
        repository.deleteById(id);
        return "Transport Deleted Successfully";
    }
}