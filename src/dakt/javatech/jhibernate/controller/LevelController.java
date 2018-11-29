package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Grammarguideline;
import dakt.javatech.jhibernate.entity.Level;
import dakt.javatech.jhibernate.service.LevelService;

@RestController
public class LevelController {
	
	@Autowired LevelService LevelService;
	
	@RequestMapping(value ="/getListLevel", method = RequestMethod.GET, headers ="Accept=application/json")
	 public List<Level> List(){
		List<Level> list = LevelService.list();
		return list;
	}
	
	@RequestMapping(value ="/getListLevel/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Level> getListByListenExerciseId(@PathVariable int first, @PathVariable int max) {
		List<Level> list = LevelService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getLevel/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Level getLevelById(@PathVariable int id) {
		return LevelService.getById(id);
	}
	
	@RequestMapping(value = "/addLevel", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addLevel(@RequestBody Level level) {	
		LevelService.add(level);
	}
	
	@RequestMapping(value = "/updateLevel", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateLevel(@RequestBody Level level) {
		LevelService.update(level);
	}

	@RequestMapping(value = "/deleteLevel/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteLevel(@PathVariable("id") int id) {
		LevelService.delete(id);	
	}
}