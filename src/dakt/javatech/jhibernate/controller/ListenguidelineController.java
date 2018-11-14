package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Grammarguideline;
import dakt.javatech.jhibernate.entity.ListenGuideline;
import dakt.javatech.jhibernate.service.ListenguidelineService;

@RestController
public class ListenguidelineController {
	@Autowired
	ListenguidelineService listenGuidelineService;
	
	@RequestMapping(value ="/getListListListenguidelineByLevelId/LevelId={id}&first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<ListenGuideline> getListByLevelId(@PathVariable String id,@PathVariable int first,@PathVariable int max){
		 List<ListenGuideline> ListByLevelId = listenGuidelineService.getListByLevelId(id, first, max);
		 return ListByLevelId;
		
	}
	@RequestMapping(value ="/getListListenguidelineById/id={id}", method = RequestMethod.GET, headers ="Accept=application/json")
	public ListenGuideline getListenGuidelineById(@PathVariable String id) {
		ListenGuideline listenguideline = listenGuidelineService.getListenGuidelineById(id);
		return listenguideline;
	}
	
	@RequestMapping(value ="/getListListenguideline", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<ListenGuideline> List() {
		List<ListenGuideline> list = listenGuidelineService.list();
		return list;
	}
	
	@RequestMapping(value ="/getListListenguidelineByLevelId/LevelId={level}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<ListenGuideline> getListByLevelId(@PathVariable String level){
		 List<ListenGuideline> ListByLevelId = listenGuidelineService.getListByLevelId(level);
		 return ListByLevelId;
		
	}
}
