package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.ReadquestionDao;
import dakt.javatech.jhibernate.entity.Readquestion;

@Service
@Transactional
public class ReadQuestionService {
	
	@Autowired ReadquestionDao readQuestionDao;
	
	public List<Readquestion> list()
	{
		return readQuestionDao.list();
	}
	
	public List<Readquestion> list(int first, int max)
	{
		return readQuestionDao.list(first, max);
	}
	public Readquestion getById(int id)
	{
		return readQuestionDao.getById(id);
	}
	public void add(Readquestion sp)
	{
		readQuestionDao.add(sp);
	}

	public void delete(int id)
	{
		readQuestionDao.delete(id);
	}
	
	public List<Readquestion> getId(String s, int id)
	{
		return readQuestionDao.getId(s, id);
	}
	
	public List<Readquestion> getListByLevelId(String readexeriseid){
		return readQuestionDao.getListByLevelId(readexeriseid);
	}
	
	public List<Readquestion> getListPage(int first, int max, String readexeriseid)
	{
		return readQuestionDao.getListPage(first, max, readexeriseid);
	}

}
