package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.ExaminationDao;
import dakt.javatech.jhibernate.entity.Examination;


@Service

public class ExaminationService {
@Autowired ExaminationDao examinationDao;
	
	@Transactional
	public List<Examination> list()
	{
		return examinationDao.list();
	}
	
	@Transactional
	public List<Examination> list(int first, int max)
	{
		return examinationDao.list(first,max);
	}
	
	@Transactional
	public Examination getById(int id)
	{
		return examinationDao.getById(id);
	}
	
	@Transactional
	public void add(Examination exam)
	{
		examinationDao.add(exam);
	}
	
	public void update(Examination exam)
	{
		examinationDao.update(exam);
	}
	
	@Transactional
	public void delete(int id)
	{
		examinationDao.delete(id);
	}

}
