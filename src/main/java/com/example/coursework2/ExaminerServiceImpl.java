package com.example.coursework2;

import com.example.coursework2.Service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
    questionService.getRandomQuestion();
        return getQuestions(amount);
    }

}
