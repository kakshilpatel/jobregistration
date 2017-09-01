package com.as.registration.controller.dao.jdbc;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.as.registration.dao.RegistrationDAO;
import com.as.registration.domain.Jobs;
import com.as.registration.domain.Registration;
import org.springframework.transaction.annotation.Transactional;


@Repository("RegistrationDAOImp")
@Transactional
public class RegistrationDAOImp implements RegistrationDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf)
	{
		this.sessionFactory = sf;
	}
	
	public void insertRegistrationInformation(Registration reg)
	{
			Session session; 
			session = this.sessionFactory.getCurrentSession();
			session.persist(reg);
	}
	public List<Registration> findAll()
	{
		Session session;
		session=this.sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Registration");
		return query.list();
	}
	
	public List<Jobs> findAllJobs()
	{
		Session session;
		session=this.sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Jobs");
		return query.list();
	}
}
