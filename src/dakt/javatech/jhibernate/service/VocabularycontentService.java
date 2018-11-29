package dakt.javatech.jhibernate.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.VocabularycontentDao;
import dakt.javatech.jhibernate.entity.Vocabularycontent;
@Service
public class VocabularycontentService {
	@Autowired VocabularycontentDao vocabularyContentDao;
	
	@Transactional
	public List<Vocabularycontent> list()
	{
		return vocabularyContentDao.list();
	}
	
	@Transactional
	public List<Vocabularycontent> list(int first, int max)
	{
		return vocabularyContentDao.list(first, max);
	}
	
	@Transactional
	public Vocabularycontent getById(int id)
	{
		return vocabularyContentDao.getById(id);
	}
	
	@Transactional
	public void add(Vocabularycontent vocabularycontent)
	{
		vocabularyContentDao.add(vocabularycontent);
	}
	
	@Transactional
	public void update(Vocabularycontent vocabularycontent)
	{
		vocabularyContentDao.update(vocabularycontent);
	}
	
	@Transactional
	public void delete(int id)
	{
		vocabularyContentDao.delete(id);
	}
	
	@Transactional
	public List<Vocabularycontent> getId(String s, int id)
	{
		return vocabularyContentDao.getId(s, id);
	}
	
	@Transactional
	public List<Vocabularycontent> getListByLevelId(String vocabid)
	{
		return vocabularyContentDao.getListByLevelId(vocabid);
	}
	
	@Transactional
	public List<Vocabularycontent> getListPage(int first, int max, String vocabid)
	{
		return vocabularyContentDao.getListPage(first, max, vocabid);
	}
}

