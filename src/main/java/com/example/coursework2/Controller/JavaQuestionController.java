package com.example.coursework2.Controller;

import com.example.coursework2.Question;
import com.example.coursework2.Service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class JavaQuestionController {
    private final QuestionService questionService;


    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public Question addQuestion(@RequestParam String question,
                                @RequestParam String answer) {
        return questionService.addQuestion(new Question(question, answer));
    }

    @GetMapping("/remove")
    public Question removeQuestion(@RequestParam String question,
                                   @RequestParam String answer) {
        return questionService.removeQuestion(new Question(question, answer));
    }

    @GetMapping("/find")
    public Question findQuestion(@RequestParam String question,
                                 @RequestParam String answer) {
        return questionService.findQuestion(new Question(question, answer));
    }


    @GetMapping()
    public Collection<Question> getQuestions() {
        return questionService.getAll();
    }


}
