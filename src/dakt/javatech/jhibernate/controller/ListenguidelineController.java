package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import dakt.javatech.jhibernate.entity.ListenGuideline;
import dakt.javatech.jhibernate.service.ListenguidelineService;

@RestController
public class ListenguidelineController {
	@Autowired
	ListenguidelineService listenGuidelineService;
	
//	@RequestMapping(value ="/getListListenguidelineByLevelId/levelId={id}", method = RequestMethod.GET, headers ="Accept=application/json")
//	public List<ListenGuideline> getListByLevelId(@PathVariable String id) {
//		List<ListenGuideline> listenguideline = listenGuidelineService.getListByLevelId(id);
//		return listenguideline;
//	}
//	@RequestMapping(value ="/getListListenguidelineById/id={id}", method = RequestMethod.GET, headers ="Accept=application/json")
//	public ListenGuideline getListById(@PathVariable int id) {
//		ListenGuideline listenguideline = listenGuidelineService.getById(id);
//		return listenguideline;
//	}
	
	@RequestMapping(value ="/getListListenguideline", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<ListenGuideline> List() {
		List<ListenGuideline> list = listenGuidelineService.list();
		return list;
	}
}
