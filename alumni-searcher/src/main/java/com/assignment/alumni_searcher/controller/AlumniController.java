package com.assignment.alumni_searcher.controller;

import com.assignment.alumni_searcher.dto.*;
import com.assignment.alumni_searcher.service.AlumniService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/alumni")
@RequiredArgsConstructor
public class AlumniController {

    private final AlumniService alumniService;

    @PostMapping("/search")
    public ResponseEntity<?> search(@RequestBody AlumniSearchRequest request) {

        List<AlumniResponse> data = alumniService.searchAlumni(request);

        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("data", data);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {

        List<AlumniResponse> data = alumniService.getAllAlumni();

        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("data", data);

        return ResponseEntity.ok(response);
    }
}
