package io.agileintelligence.ppmtool.domain;

import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private String projectId;
}
