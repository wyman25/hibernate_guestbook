package GuestBook.Dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import GuestBook.Guest;
import GuestBook.HibernateUtil;

public class GuestDao {
	Session session=null;
	public GuestDao(){
		session=HibernateUtil.getSession();
	}
	
	public Guest findGuest(String guestName){
		Guest guest=null;
		try{
			Transaction tran=session.beginTransaction();
			String sql="from guest g where g.username=?";
			Query query=session.createQuery(sql);
			query.setParameter(0, guestName);
			guest=(Guest) query.uniqueResult();
			tran.commit();
			return guest;
		}catch(Exception ex){
			session.getTransaction().rollback();
			ex.printStackTrace();
		}
		return guest;
	}
	
	public void SaveGuest(Guest entity){
		try{
		Transaction tran=session.beginTransaction();
		session.save(entity);
		tran.commit();
		}catch(Exception ex){
			session.getTransaction().rollback();
			ex.printStackTrace();
		}
	}
}
