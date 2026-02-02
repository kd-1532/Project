package com.clientdata.project.Controller;

import com.clientdata.project.Service.Basic;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
@Slf4j
@AllArgsConstructor
public class TaskServiceController {

    private final Basic basic;

    @PostMapping(path = "/execute", produces = "application/json")
    public String[] executeCommand() {
        log.info("Received request to execute command");
        return basic.method();
    }
}
