package com.example.demo.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class projectController {

    @GetMapping("/data")
    public ResponseEntity<?> getData(@RequestParam String n, @RequestParam(required = false) Integer m) throws IOException {
            String fileName = n + ".txt";
            ClassPathResource resource = new ClassPathResource(fileName);

            if (resource.exists()) {
                String content = new String(resource.getInputStream().readAllBytes());

                if (m != null) {
                    String[] lines = content.split("\n");
                    if (m <= 0 || m > lines.length) {
                        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("not valid " + m); // if m does not exist
                    }
                    return ResponseEntity.ok(lines[m - 1]);
                } else {
                    return ResponseEntity.ok(content);
                }
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found"); // if file doesn't exist
            }

}
}