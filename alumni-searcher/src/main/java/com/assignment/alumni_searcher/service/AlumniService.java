package com.assignment.alumni_searcher.service;

import com.assignment.alumni_searcher.dto.*;

import java.util.List;

public interface AlumniService {

    List<AlumniResponse> searchAlumni(AlumniSearchRequest request);

    List<AlumniResponse> getAllAlumni();
}
