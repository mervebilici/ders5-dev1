package nLayeredDemo2.dataAccess.concretes;



import nLayeredDemo2.dataAccess.abstracts.UserDao;
import nLayeredDemo2.entities.concretes.User;


public class SavedUserDao implements UserDao{
	
	@Override
	public void register(User user) {
		
		System.out.println("Baþarýlý bir þekilde kaydýnýz oluþturulmuþtur.");
	}

	@Override
	public void deleteRecort(User user) {
		System.out.println("Sistemden kaydýnýz silinmiþtir.");
		
	}

	@Override
	public void logIn(User user) {
		
		System.out.println("Sisteme baþarýlý bir þekilde giriþ yaptýnýz.");
	}

	@Override
	public void checkOut(User user) {
		
		System.out.println("Sistemden baþarýlý bir þekilde çýkýþ yaptýnýz.");
	}

	@Override
	public boolean checkEmail(String email) {
		
		return false;
	}

	

}
