package ua.netcracker.hr_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.netcracker.hr_system.model.entity.Question;
import ua.netcracker.hr_system.model.service.QuestionService;

import java.util.List;

/**
 * Created by ksenzod on 02.05.16.
 */
@RestController
public class QuestionRestController {
    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/service/getAllMandatoryQuestions", method = RequestMethod.GET)

    public ResponseEntity<List<Question>> getAllMandatoryQuestions() {
        List<Question> questions= (List<Question>) questionService.getAllMandatory();
        if(questions.isEmpty()){
            return new ResponseEntity<List<Question>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Question>>(questions, HttpStatus.OK);
    }
}
