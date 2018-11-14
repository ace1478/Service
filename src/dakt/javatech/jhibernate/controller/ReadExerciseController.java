package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
}
