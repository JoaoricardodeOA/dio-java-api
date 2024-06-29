package com.DioApi.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String profileImage;
    private String career;
    private int level;
    private int XP;
    private int habilities;
    private int projects;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<TechnologyIcon> technologyIcon;
}
