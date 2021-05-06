package fifthAssignmentJavaCamp.business.abstracts;

import fifthAssignmentJavaCamp.entities.concreates.User;

public interface UserService {
	void add(User user);
	void delete (User user);
	boolean getByMail(String email);
	boolean checkIfEmailCorrect(String email);


}
