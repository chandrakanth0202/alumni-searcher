package com.assignment.alumni_searcher.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AlumniResponse {

    private String name;
    private String currentRole;
    private String university;
    private String location;
    private String linkedinHeadline;
    private Integer passoutYear;
}
