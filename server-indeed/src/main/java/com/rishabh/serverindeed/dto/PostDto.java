package com.rishabh.serverindeed.dto;

import lombok.Data;

@Data
public class PostDto {
    private String profile;
    private String type;
    private String description;
    private String experience;
    private String technology[];
    private String salary;
}
