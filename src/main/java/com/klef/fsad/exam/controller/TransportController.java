package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Transport;
import com.klef.fsad.exam.service.TransportService;

@RestController
@RequestMapping("/transport")
public class TransportController 
{
    @Autowired
    private TransportService service;

    // POST API
    @PostMapping("/add")
    public Transport addTransport(@RequestBody Transport transport)
    {
        return service.addTransport(transport);
    }

    // DELETE API
    @DeleteMapping("/delete/{id}")
    public String deleteTransport(@PathVariable int id)
    {
        return service.deleteTransport(id);
    }
}