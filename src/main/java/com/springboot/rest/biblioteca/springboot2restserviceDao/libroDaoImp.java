package com.springboot.rest.biblioteca.springboot2restserviceDao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.rest.biblioteca.springboot2restservicebasic.*;
@Repository
public class libroDaoImp implements libroDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public long save(Libro book) {
      sessionFactory.getCurrentSession().save(book);
      return book.getId();
   }

   //@Override
  // public Book get(long id) {
  //    return sessionFactory.getCurrentSession().get(Book.class, id);
  // }

   @Override
   public List<Libro> list() {
      Session session = sessionFactory.getCurrentSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<Libro> cq = cb.createQuery(Libro.class);
      Root<Libro> root = cq.from(Libro.class);
      cq.select(root);
      Query<Libro> query = session.createQuery(cq);
      return query.getResultList();
   }



   @Override
   public void delete(long id) {
      Session session = sessionFactory.getCurrentSession();
      Libro book = session.byId(Libro.class).load(id);
      session.delete(book);
   }

@Override
public Libro get(long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void update(long id, Libro book) {
	// TODO Auto-generated method stub
	
}

}
