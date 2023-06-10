package com.example.coursework2.Service;

import com.example.coursework2.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {
    private final Set<Question> questions = new HashSet<>();


    @Override
    public Question addQuestion(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question findQuestion(Question question) {
        questions.contains(question);
        return question;
    }

    @Override
    public Question removeQuestion(Question question) {
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public void getRandomQuestion() {
        Random random = new Random();
        random.nextInt(5);
    }
}
