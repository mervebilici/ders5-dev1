package nLayeredDemo2.business.concretes;

import nLayeredDemo2.business.abstracts.UserService;
import nLayeredDemo2.dataAccess.abstracts.UserDao;
import nLayeredDemo2.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void add(User user) {
			String pattern = "^(.+)@(.+)$";
	        System.out.println(user.getEmail().matches(pattern));
	        if(user.getEmail().isEmpty() || user.getFirstName().isEmpty() || user.getLastName().isEmpty() || user.getPassword().isEmpty()) {
	        	System.out.println("Bo� alanlar� doldurup tekrar deneyiniz.");
	        }
	        else if (user.getPassword().length()<6) {
	        	System.out.println("Parola en az 6 karakterden olu�mal�d�r.");
	        }
	        else if(!user.getEmail().matches(pattern)) {
	        	System.out.println("Girdi�iniz e posta uygun formatta de�ildir.");
	        }
	        else if(!userDao.checkEmail(user.getEmail())) {
	        	System.out.println("Bu e posta sisteme kay�tl�.");
	        }
	        else if(user.getFirstName().length()<3 || user.getLastName().length()<3) {
	        	System.out.println("Ad ve soyad en az iki karakterdenolu�mal�d�r.");
	        }
	}

}
