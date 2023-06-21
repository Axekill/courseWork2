package com.example.coursework2.Service;

import com.example.coursework2.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface QuestionService {
    Question addQuestion(Question question);

    Question removeQuestion(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion();
}
