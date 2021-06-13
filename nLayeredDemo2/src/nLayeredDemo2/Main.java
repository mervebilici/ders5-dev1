package nLayeredDemo2;

import nLayeredDemo2.business.abstracts.UserService;
import nLayeredDemo2.business.concretes.UserManager;
import nLayeredDemo2.core.abstracts.Authentication;
import nLayeredDemo2.core.concretes.GoogleAuthentication;
import nLayeredDemo2.dataAccess.concretes.SavedUserDao;
import nLayeredDemo2.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new SavedUserDao() );
         User user= new User("Merve", "Bilici", "mervebilici@gmail.com", "1456123");
         
         userService.add(user);
         
         Authentication authentication = new GoogleAuthentication();
         authentication.register();
	}

}
