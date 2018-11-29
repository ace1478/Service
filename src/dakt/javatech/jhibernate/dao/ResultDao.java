package dakt.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dakt.javatech.jhibernate.entity.Result;

@Component 
@Transactional
public class ResultDao {
	@Autowired
	private SessionFactory sessionFactory;
	public List<Result> list()
	{
		String hql="FROM Result";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<Result> list(int first, int max)
	{
		String hql="FROM Result";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public Result getById(int id)
	{
		return (Result)sessionFactory.getCurrentSession().get(Result.class, id);
	}
	public void add(Result result)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(result);
	}

	public void update(Result result) {
		sessionFactory.getCurrentSession().update(result);
	}
	
	public void delete(int id)
	{
		Result result=getById(id);
		sessionFactory.getCurrentSession().delete(result);
	}
	
	public List<Result> getId(String s, int id)
	{
		String hql="FROM Result WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Result>)query.list();
	}

}
