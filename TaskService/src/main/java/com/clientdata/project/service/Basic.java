package com.clientdata.project.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Slf4j
@Service
public class Basic {

    public String[] method() {
        String[] command = "echo Hello, World!".split(" ");
        log.info("Executing command: {}", (Object) command);
        return command;
    }
}
