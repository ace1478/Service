package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.ReadquestionDao;
import dakt.javatech.jhibernate.entity.Readquestion;

@Service
public class ReadQuestionService {
	
	@Autowired ReadquestionDao readQuestionDao;
	
	@Transactional
	public List<Readquestion> list()
	{
		return readQuestionDao.list();
	}
	
	@Transactional
	public List<Readquestion> list(int first, int max)
	{
		return readQuestionDao.list(first, max);
	}
	
	@Transactional
	public Readquestion getById(int id)
	{
		return readQuestionDao.getById(id);
	}
	
	@Transactional
	public void add(Readquestion readquestion)
	{
		readQuestionDao.add(readquestion);
	}
	
	@Transactional
	public void update(Readquestion readquestion)
	{
		readQuestionDao.update(readquestion);
	}

	@Transactional
	public void delete(int id)
	{
		readQuestionDao.delete(id);
	}
	
	@Transactional
	public List<Readquestion> getId(String s, int id)
	{
		return readQuestionDao.getId(s, id);
	}
	
	@Transactional
	public List<Readquestion> getListByReadExerciseId(int readexeriseid){
		return readQuestionDao.getListByReadExerciseId(readexeriseid);
	}
	
	@Transactional
	public List<Readquestion> getListByReadExerciseIdPage(int first, int max, String readexeriseid)
	{
		return readQuestionDao.getListByReadExerciseIdPage(first, max, readexeriseid);
	}

}
