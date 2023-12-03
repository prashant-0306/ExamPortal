package com.exam.Services.Implement;

import com.exam.Entities.Exam.Category;
import com.exam.Entities.Exam.Quiz;
import com.exam.Repositories.QuizRepository;
import com.exam.Services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return this.quizRepository.save(quiz);
    }

    @Override
    public Quiz updateQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public Set<Quiz> getQuizzes() {
        return new HashSet<>(quizRepository.findAll());
    }

    @Override
    public Quiz getQuiz(Long qid) {
        return quizRepository.findById(qid).get();
    }

    @Override
    public void deleteQuiz(Long qid) {
        quizRepository.deleteById(qid);
    }

    @Override
    public List<Quiz> getQuizzesOfCategory(Category category) {
        return this.quizRepository.findByCategory(category);
    }

    @Override
    public List<Quiz> getActiveQuizzes() {
        return quizRepository.findByActive(true);
    }

    @Override
    public List<Quiz> getActiveQuizzesOfCategory(Category category) {
        return quizRepository.findByCategoryAndActive(category, true);
    }
}
