package nLayeredDemo2.dataAccess.abstracts;



import nLayeredDemo2.entities.concretes.User;

public interface UserDao {
         void register(User user);
         void deleteRecort(User user);
         void logIn(User user);
         void checkOut(User user);
         boolean checkEmail(String email);
}
