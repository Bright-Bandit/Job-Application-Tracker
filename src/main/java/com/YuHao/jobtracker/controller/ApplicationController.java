package com.YuHao.jobtracker.controller;

import com.YuHao.jobtracker.entity.Application;
import com.YuHao.jobtracker.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/applications")
@CrossOrigin(origins = "http://localhost:5173")
public class ApplicationController {

    private final ApplicationService service;

    public ApplicationController(ApplicationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Application> getAllApplications(){
        return service.getAllApplications();
    }

    @PostMapping
    public Application createApplication(
            @RequestBody Application application){
        return service.createApplication(application);
    }
}
