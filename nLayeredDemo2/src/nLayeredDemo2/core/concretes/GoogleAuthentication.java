package nLayeredDemo2.core.concretes;

import nLayeredDemo2.core.abstracts.Authentication;

public class GoogleAuthentication implements Authentication{

	@Override
	public void register() {
		System.out.println("Google ile kayýt olundu.");
		
	}

	@Override
	public void signIn() {
		System.out.println("Google ile giriþ yapýldý.");
		
	}

	@Override
	public void signOut() {
		System.out.println("Google ile çýkýþ yapýldý.");
		
	}
	
}
