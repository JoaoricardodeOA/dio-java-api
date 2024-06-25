package com.DioApi.Models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tb_education_recommendation")
public class EducationRecommendation extends Features{
    private String description;
}
