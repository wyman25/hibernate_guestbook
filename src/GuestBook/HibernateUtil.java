package GuestBook;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static final ThreadLocal<Session> threadlocal=new ThreadLocal<Session>();
	private static SessionFactory sessionFactory=null;
	
	static{
			sessionFactory=buildSessionFactory();
	}
	
	private static SessionFactory buildSessionFactory(){
		
		 Configuration configuration = new Configuration();
		    configuration.configure();

		    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
		            configuration.getProperties()).build();
		    return configuration.buildSessionFactory(serviceRegistry);
	}
	
	public static Session getSession(){
		Session session=(Session)threadlocal.get();
		if(session==null){
			if(sessionFactory==null){
				buildSessionFactory();
			}
			session=sessionFactory.openSession();
			threadlocal.set(session);
		}
		return session;
		
	}
}
