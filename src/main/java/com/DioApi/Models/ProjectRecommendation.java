package com.DioApi.Models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tb_project_recommendation")
public class ProjectRecommendation extends Features{
    private String description;
    private String technology;
}
