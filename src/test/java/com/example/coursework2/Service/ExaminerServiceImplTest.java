package com.example.coursework2.Service;

import com.example.coursework2.Question;
import com.example.coursework2.QuestionNotAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ExaminerServiceImplTest {
    @Mock
    JavaQuestionService questionServiceMock;
    ExaminerServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        service = new ExaminerServiceImpl(questionServiceMock);
    }
    @Test
    void getQuestions() {
        Set<Question> questions = Set.of(
                new Question("q", "a"),
                new Question("q1", "a1"),
                new Question("q2", "a2")
        );
        when(questionServiceMock.getAll()).thenReturn(questions);
        when(questionServiceMock.getRandomQuestion()).thenReturn(
                new Question("q", "a"),
                new Question("q1", "a1"),
                new Question("q1", "a1")
        );
        assertEquals(2, service.getQuestions(2).size());
    }
    @Test
    void getQuestionException() {
        questionServiceMock.addQuestion(new Question("q", "a"));
        questionServiceMock.addQuestion(new Question("q1", "a1"));
        questionServiceMock.addQuestion(new Question("q2", "a2"));
        when(questionServiceMock.getAll()).thenThrow(QuestionNotAmountException.class);
        assertThrows(QuestionNotAmountException.class, () -> service.getQuestions(4));
    }
}