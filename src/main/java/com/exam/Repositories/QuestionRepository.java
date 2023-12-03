package com.exam.Repositories;


import com.exam.Entities.Exam.Question;
import com.exam.Entities.Exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question,Long> {
    Set<Question> findByQuiz(Quiz quiz);
}

