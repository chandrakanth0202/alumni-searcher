package com.assignment.alumni_searcher.service.impl;

import com.assignment.alumni_searcher.dto.*;
import com.assignment.alumni_searcher.entity.Alumni;
import com.assignment.alumni_searcher.repository.AlumniRepository;
import com.assignment.alumni_searcher.service.AlumniService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AlumniServiceImpl implements AlumniService {

    private final AlumniRepository alumniRepository;

    @Override
    public List<AlumniResponse> searchAlumni(AlumniSearchRequest request) {

        Alumni alumni = Alumni.builder()
                .name("John Doe")
                .currentRole(request.getDesignation())
                .university(request.getUniversity())
                .location("New York")
                .linkedinHeadline("Passionate Engineer")
                .passoutYear(request.getPassoutYear())
                .build();

        alumniRepository.save(alumni);

        return List.of(
                AlumniResponse.builder()
                        .name(alumni.getName())
                        .currentRole(alumni.getCurrentRole())
                        .university(alumni.getUniversity())
                        .location(alumni.getLocation())
                        .linkedinHeadline(alumni.getLinkedinHeadline())
                        .passoutYear(alumni.getPassoutYear())
                        .build()
        );
    }

    @Override
    public List<AlumniResponse> getAllAlumni() {
        return alumniRepository.findAll()
                .stream()
                .map(a -> AlumniResponse.builder()
                        .name(a.getName())
                        .currentRole(a.getCurrentRole())
                        .university(a.getUniversity())
                        .location(a.getLocation())
                        .linkedinHeadline(a.getLinkedinHeadline())
                        .passoutYear(a.getPassoutYear())
                        .build())
                .collect(Collectors.toList());
    }
}
