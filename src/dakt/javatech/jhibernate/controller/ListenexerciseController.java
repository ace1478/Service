package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Listenexercise;
import dakt.javatech.jhibernate.service.ListenexerciseService;

@RestController
public class ListenexerciseController {
	@Autowired
	ListenexerciseService listenExrSer;
	@RequestMapping(value ="/getListListenexerciseByLevelId/levelId={id}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Listenexercise> getListByLevelId(@PathVariable String id) {
		List<Listenexercise> listenexercise = listenExrSer.getListByLevelId(id);
		return listenexercise;
	}
	@RequestMapping(value ="/getListListenexerciseById/id={id}", method = RequestMethod.GET, headers ="Accept=application/json")
	public Listenexercise getById(@PathVariable int id) {
		Listenexercise listenexercise = listenExrSer.getById(id);
		return listenexercise;
	}
	@RequestMapping(value ="/getLstListenexerciseById/id={id}&first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Listenexercise> getListById(@PathVariable String id,@PathVariable int first,@PathVariable int max) {
		List<Listenexercise> listenexercise = listenExrSer.getListByLevelId(id, first, max);
		return listenexercise;
	}
}
