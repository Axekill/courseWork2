package com.example.coursework2.Service;

import com.example.coursework2.Question;
import com.example.coursework2.QuestionNotAmountException;
import com.example.coursework2.Service.ExaminerService;
import com.example.coursework2.Service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        var allQuestions = questionService.getAll();
        if (allQuestions.size() < amount) {
            throw new QuestionNotAmountException();
        }
        if (allQuestions.size() == amount) {
            return allQuestions;
        }
        Set<Question> questions = new HashSet<>(amount);
        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }

}
