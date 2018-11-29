package dakt.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dakt.javatech.jhibernate.entity.Examinationquestion;

@Component 
@Transactional
public class ExaminationquestionDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Examinationquestion> list()
	{
		String hql="FROM Examinationquestion";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<Examinationquestion> list(int first, int max)
	{
		String hql="FROM Examinationquestion";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public Examinationquestion getById(int id)
	{
		return (Examinationquestion)sessionFactory.getCurrentSession().get(Examinationquestion.class, id);
	}
	public void add(Examinationquestion examquestion)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(examquestion);
	}
	public void update(Examinationquestion examquestion) {
		sessionFactory.getCurrentSession().update(examquestion);
	}
	public void delete(int id)
	{
		Examinationquestion examquestion=getById(id);
		sessionFactory.getCurrentSession().delete(examquestion);
	}
	
	public List<Examinationquestion> getId(String s, int id)
	{
		String hql="FROM Examinationquestion WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Examinationquestion>)query.list();
	}

}
