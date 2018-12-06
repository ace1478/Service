package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.ExaminationquestionDao;
import dakt.javatech.jhibernate.entity.Examinationquestion;



@Service
public class ExaminationquestionService {
	
    @Autowired ExaminationquestionDao examinationquestionDao;
	
	@Transactional
	public List<Examinationquestion> list()
	{
		return examinationquestionDao.list();
	}
	
	@Transactional
	public List<Examinationquestion> list(int first, int max)
	{
		return examinationquestionDao.list(first,max);
	}
	
	@Transactional
	public Examinationquestion getById(int id)
	{
		return examinationquestionDao.getById(id);
	}
	
	@Transactional
	public void add(Examinationquestion examquestion)
	{
		examinationquestionDao.add(examquestion);
	}
	
	public void update(Examinationquestion examquestion)
	{
		examinationquestionDao.update(examquestion);
	}
	
	@Transactional
	public void delete(int id)
	{
		examinationquestionDao.delete(id);
	}
	@Transactional
	public List<Examinationquestion> getListByPart(String part,String examinationId)
	{
		return examinationquestionDao.getListByPart(part,examinationId);
	}
	@Transactional
	public List<Examinationquestion> getListByExaminationId(int id)
	{
		return examinationquestionDao.getListByExaminationId(id);
	}


}
