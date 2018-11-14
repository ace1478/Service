package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Vocabularycontent;
import dakt.javatech.jhibernate.entity.Vocabularyguideline;
import dakt.javatech.jhibernate.service.VocabularycontentService;
@RestController
public class VocabularycontentController {
	
	@Autowired
	VocabularycontentService vocabularyContentService;
	
	@RequestMapping(value ="/getListVocabularycontent", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Vocabularycontent> List() {
		List<Vocabularycontent> list = vocabularyContentService.list();
		return list;
	}
	
	@RequestMapping(value ="/getListListVocabularycontentByLevelId/LevelId={vocabid}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Vocabularycontent> getListByLevelId(@PathVariable String vocabid){
		 List<Vocabularycontent> ListByLevelId = vocabularyContentService.getListByLevelId(vocabid);
		 return ListByLevelId;
		
	}
	
	@RequestMapping(value ="/getListPageVocabularycontentByLevelId/LevelId={vocabid}&first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Vocabularycontent> getListByLevelId(@PathVariable int first,@PathVariable int max,@PathVariable String vocabid){
		 List<Vocabularycontent> ListByLevelId = vocabularyContentService.getListPage( first, max, vocabid);
		 return ListByLevelId;
		
	}

}
