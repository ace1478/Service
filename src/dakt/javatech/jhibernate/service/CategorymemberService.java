package dakt.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dakt.javatech.jhibernate.dao.CategorymemberDao;
import dakt.javatech.jhibernate.entity.Categorymember;


@Service
public class CategorymemberService {
	
	@Autowired CategorymemberDao categorymemberDao;
	
	@Transactional
	public List<Categorymember> list()
	{
		return categorymemberDao.list();
	}
	
	@Transactional
	public List<Categorymember> list(int first, int max)
	{
		return categorymemberDao.list(first,max);
	}
	
	@Transactional
	public Categorymember getById(int id)
	{
		return categorymemberDao.getById(id);
	}
	
	@Transactional
	public void add(Categorymember cate)
	{
		categorymemberDao.add(cate);
	}
	
	public void update(Categorymember catemember)
	{
		categorymemberDao.update(catemember);
	}
	
	@Transactional
	public void delete(int id)
	{
		categorymemberDao.delete(id);
	}


}
