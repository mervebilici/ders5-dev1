package nLayeredDemo2.dataAccess.concretes;



import nLayeredDemo2.dataAccess.abstracts.UserDao;
import nLayeredDemo2.entities.concretes.User;


public class SavedUserDao implements UserDao{
	
	@Override
	public void register(User user) {
		
		System.out.println("Ba�ar�l� bir �ekilde kayd�n�z olu�turulmu�tur.");
	}

	@Override
	public void deleteRecort(User user) {
		System.out.println("Sistemden kayd�n�z silinmi�tir.");
		
	}

	@Override
	public void logIn(User user) {
		
		System.out.println("Sisteme ba�ar�l� bir �ekilde giri� yapt�n�z.");
	}

	@Override
	public void checkOut(User user) {
		
		System.out.println("Sistemden ba�ar�l� bir �ekilde ��k�� yapt�n�z.");
	}

	@Override
	public boolean checkEmail(String email) {
		
		return false;
	}

	

}
