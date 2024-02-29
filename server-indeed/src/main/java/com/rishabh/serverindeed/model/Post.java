package com.rishabh.serverindeed.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "posts")
public class Post {
    @NotNull
    private String profile;
    @NotNull
    private String type;
    @NotNull
    private String description;
    @NotNull
    private String experience;
    @NotNull
    private String technology[];
    @NotNull
    private String salary;
    private Date createdAt;
}
