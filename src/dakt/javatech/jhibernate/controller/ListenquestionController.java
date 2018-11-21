package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Listenquestion;
import dakt.javatech.jhibernate.service.ListenquestionService;

@RestController
public class ListenquestionController {
	@Autowired
	ListenquestionService listenQuestionService;
	@RequestMapping(value ="/getListListenquestion", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Listenquestion> List() {
		List<Listenquestion> list = listenQuestionService.list();
		return list;
	}
	@RequestMapping(value ="/getListListenquestion/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Listenquestion> List(@PathVariable int first, @PathVariable int max) {
		List<Listenquestion> list = listenQuestionService.list(first,max);
		return list;
	}
	@RequestMapping(value ="/getListListenquestion/id={id}", method = RequestMethod.GET, headers ="Accept=application/json")
	public Listenquestion getById(@PathVariable int id) {
		Listenquestion item = listenQuestionService.getById(id);
		return item;
	}
	@RequestMapping(value ="/getListByListenExerciseId/ListenExerciseId={ListenExerciseId}&first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Listenquestion> getListByListenExerciseId(@PathVariable String ListenExerciseId,@PathVariable int first, @PathVariable int max) {
		List<Listenquestion> list = listenQuestionService.getListByListenExerciseId(ListenExerciseId, first, max);
		return list;
	}
	@RequestMapping(value ="/getListByListenExerciseId1/ListenExerciseId={ListenExerciseId}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Listenquestion> getListByListenExerciseId(@PathVariable String ListenExerciseId) {
		List<Listenquestion> list = listenQuestionService.getListByListenExerciseId(ListenExerciseId);
		return list;
	}


}
