package dakt.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dakt.javatech.jhibernate.entity.Examination;

@Repository
public class ExaminationDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Examination> list()
	{
		String hql="FROM Examination";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<Examination> list(int first, int max)
	{
		String hql="FROM Examination";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public Examination getById(int id)
	{
		return (Examination)sessionFactory.getCurrentSession().get(Examination.class, id);
	}
	public void add(Examination sp)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(sp);
	}
	
	public void update(Examination exam) {
		sessionFactory.getCurrentSession().update(exam);
	}
	
	public void delete(int id)
	{
		Examination exam=getById(id);
		sessionFactory.getCurrentSession().delete(exam);
	}
	
	public List<Examination> getId(String s, int id)
	{
		String hql="FROM Examination WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Examination>)query.list();
	}

}
