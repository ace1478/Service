package dakt.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dakt.javatech.jhibernate.entity.Level;

@Component 
@Transactional
public class LevelDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Level> list()
	{
		String hql="FROM Level";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<Level> list(int first, int max)
	{
		String hql="FROM Level";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public Level getById(int id)
	{
		return (Level)sessionFactory.getCurrentSession().get(Level.class, id);
	}
	public void add(Level sp)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(sp);
	}

	public void update(Level level) {
		sessionFactory.getCurrentSession().update(level);;
	}
	
	public void delete(int id)
	{
		Level acc=getById(id);
		sessionFactory.getCurrentSession().delete(acc);
	}
	
	public List<Level> getId(String s, int id)
	{
		String hql="FROM Level WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Level>)query.list();
	}

}
