package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<Readquestion> getListByLevelId(@PathVariable int readexeriseid) {
		List<Readquestion> lstReadQuestion = readQuesService.getListByReadExerciseId(readexeriseid);
		return lstReadQuestion;
	}
	
	@RequestMapping(value ="/getListReadQuestionPage/first={first}&max={max}&readexeriseid={readexeriseid}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Readquestion> getListByReadExerciseIdPage(@PathVariable int first, @PathVariable int max,@PathVariable String readexeriseid) {
		List<Readquestion> list = readQuesService.getListByReadExerciseIdPage(first, max, readexeriseid);
		return list;
	}
	
	@RequestMapping(value ="/getList/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Readquestion> getList(@PathVariable int first, @PathVariable int max) {
		List<Readquestion> list = readQuesService.list(first, max);
		return list;
	}
	
	@RequestMapping(value ="/getListReadQuestion", method = RequestMethod.GET, headers ="Accept=application/json")
	 public List<Readquestion> List(){
		List<Readquestion> list = readQuesService.list();
		return list;
	}
	
	@RequestMapping(value = "/getReadQuestionById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Readquestion getReadQuestionById(@PathVariable int id) {
		return readQuesService.getById(id);
	}
	
	@RequestMapping(value = "/addReadQuestion", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addReadQuestion(@RequestBody Readquestion readquestion) {	
		readQuesService.add(readquestion);
	}
	
	@RequestMapping(value = "/updateReadQuestion", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateReadQuestion(@RequestBody Readquestion readquestion) {
		readQuesService.update(readquestion);
	}

	@RequestMapping(value = "/deleteReadQuestion/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteReadQuestion(@PathVariable("id") int id) {
		readQuesService.delete(id);	
	}
}
