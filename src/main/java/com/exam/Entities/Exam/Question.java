package com.exam.Entities.Exam;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quesId;
    private String content;

    private String image;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    private String answer;


    @ManyToOne(fetch = FetchType.EAGER)
    private Quiz quiz;
}