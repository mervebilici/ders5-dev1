package nLayeredDemo2.core.concretes;

import nLayeredDemo2.core.abstracts.Authentication;

public class GoogleAuthentication implements Authentication{

	@Override
	public void register() {
		System.out.println("Google ile kay�t olundu.");
		
	}

	@Override
	public void signIn() {
		System.out.println("Google ile giri� yap�ld�.");
		
	}

	@Override
	public void signOut() {
		System.out.println("Google ile ��k�� yap�ld�.");
		
	}
	
}
