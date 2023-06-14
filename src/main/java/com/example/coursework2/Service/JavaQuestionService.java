package com.example.coursework2.Service;

import com.example.coursework2.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private final Set<Question> questions = new HashSet<>();
    // List<Question>list=new ArrayList<>(questions);


    @Override
    public Question addQuestion(Question question) {
        questions.add(question);
        return question;
    }

//    @Override
//    public Question findQuestion(Question question) {
//        questions.contains(question);
//        return question;
//    }

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

    public Question getRandomQuestion() {
        List<Question> list = new ArrayList<>(questions);
        int size= list.size();
        int rndIdx=new Random().nextInt(size);
        return list.get(rndIdx);
    }
}
