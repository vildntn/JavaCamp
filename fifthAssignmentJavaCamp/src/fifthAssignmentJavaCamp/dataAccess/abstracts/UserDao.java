package fifthAssignmentJavaCamp.dataAccess.abstracts;



import fifthAssignmentJavaCamp.entities.concreates.User;

public interface UserDao {
     void add(User user);
     void delete (User user);
     void update(User user);
     boolean getByMail(String email);
     User get(int id);
 
}
