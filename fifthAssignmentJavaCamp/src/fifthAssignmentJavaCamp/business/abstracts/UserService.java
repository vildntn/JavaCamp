package fifthAssignmentJavaCamp.business.abstracts;

import fifthAssignmentJavaCamp.entities.concreates.User;

public interface UserService {
	void add(User user);
	void delete (User user);
	boolean getByMail(String email);
	User get(int userId);
	boolean checkIfEmailCorrect(String email);


}
