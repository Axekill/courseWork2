package com.example.coursework2.Service;

import com.example.coursework2.Question;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {

    JavaQuestionService javaQuestionService = new JavaQuestionService();

    @Test
    void addQuestion() {
       var expected=new Question("q","a");
       var actual=javaQuestionService.addQuestion(new Question("q","a"));
       assertEquals(expected,actual);
    }

    @Test
    void removeQuestion() {
        javaQuestionService.addQuestion(new Question("q","a"));
        javaQuestionService.addQuestion(new Question("q1","a1"));
        javaQuestionService.addQuestion(new Question("q2","a2"));
        javaQuestionService.addQuestion(new Question("q3","a3"));
        javaQuestionService.removeQuestion(new Question("q2","a2"));
        assertEquals(3,javaQuestionService.getAll().size());

    }

    @Test
    void getAll() {
        javaQuestionService.addQuestion(new Question("q","a"));
        javaQuestionService.addQuestion(new Question("q1","a1"));
        javaQuestionService.addQuestion(new Question("q2","a2"));
        javaQuestionService.addQuestion(new Question("q3","a3"));
        assertEquals(4,javaQuestionService.getAll().size());
    }

    @Test
    void getRandomQuestion() {

    }
}