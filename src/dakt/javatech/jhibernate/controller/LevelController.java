package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}