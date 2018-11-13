package dakt.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dakt.javatech.jhibernate.entity.Vocabularyguideline;
import dakt.javatech.jhibernate.service.VocabularyguidelineService;
@RestController
public class VocabularyguidelineController {

	@Autowired
	VocabularyguidelineService vocabularyGuidelineService;
	@RequestMapping(value ="/getListVocabularyguideline", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Vocabularyguideline> List() {
		List<Vocabularyguideline> list = vocabularyGuidelineService.list();
		return list;
	}
}
