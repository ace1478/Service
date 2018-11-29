package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Readexercise;
import dakt.javatech.jhibernate.service.ReadExerciseService;

@RestController
public class ReadExerciseController {
	@Autowired
	ReadExerciseService readExService;
	
	@RequestMapping(value ="/getListReadExerciseByLevelId/levelId={level}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Readexercise> getListByLevelId(@PathVariable String level) {
		List<Readexercise> lstReadExercise = readExService.getListByLevelId(level);
		return lstReadExercise;
	}
	
	@RequestMapping(value ="/getListByLevelIdPage/level={level}&first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Readexercise> getListByListenExerciseId(@PathVariable String level,@PathVariable String first, @PathVariable String max) {
		int firstInt = Integer.parseInt(first);
		int maxInt = Integer.parseInt(max);
		List<Readexercise> list = readExService.getListByLevelIdPage(level, firstInt, maxInt);
		return list;
	}
	
	@RequestMapping(value ="/getAllReadExercise", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Readexercise> getAllReadExercise() {
		List<Readexercise> lstReadExercise = readExService.list();
		return lstReadExercise;
	}
	
	@RequestMapping(value ="/getListReadexercise/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Readexercise> getListReadexercise(@PathVariable int first, @PathVariable int max) {
		List<Readexercise> list = readExService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getReadexerciseById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Readexercise getReadexerciseById(@PathVariable int id) {
		return readExService.getById(id);
	}
	
	@RequestMapping(value ="/addReadexercise", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addReadExercise(@RequestBody Readexercise readExercise) {
		readExService.add(readExercise);
	}
	
	@RequestMapping(value = "/updateReadexercise", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateReadexercise(@RequestBody Readexercise readexercise) {
		readExService.update(readexercise);
	}

	@RequestMapping(value = "/deleteReadexercise/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteReadexercise(@PathVariable("id") int id) {
		readExService.delete(id);	
	}
}
