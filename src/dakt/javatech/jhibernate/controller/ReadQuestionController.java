package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Readquestion;
import dakt.javatech.jhibernate.service.ReadQuestionService;


@RestController
public class ReadQuestionController {
	@Autowired
	ReadQuestionService readQuesService;
	
	@RequestMapping(value ="/getListReadQuestionByExId/readexeriseid={readexeriseid}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Readquestion> getListByLevelId(@PathVariable String readexeriseid) {
		List<Readquestion> lstReadQuestion = readQuesService.getListByLevelId(readexeriseid);
		return lstReadQuestion;
	}
	
	@RequestMapping(value ="/getListReadQuestionPage/first={first}&max={max}&readexeriseid={readexeriseid}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Readquestion> getListByListenExerciseId(@PathVariable int first, @PathVariable int max,@PathVariable String readexeriseid) {
		List<Readquestion> list = readQuesService.getListPage(first, max, readexeriseid);
		return list;
	}
	
	@RequestMapping(value ="/getList/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Readquestion> getListByListenExerciseId(@PathVariable int first, @PathVariable int max) {
		List<Readquestion> list = readQuesService.list(first, max);
		return list;
	}
}
