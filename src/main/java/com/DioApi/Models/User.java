package com.DioApi.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProjectRecommendation> projectRecommendation;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<EducationRecommendation> educationRecommendation;
}
