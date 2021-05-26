package fifthAssignmentJavaCamp.business.abstracts;

import fifthAssignmentJavaCamp.entities.concreates.User;

public interface AuthService {
      boolean register(User user);
      boolean login(User user);
      void registerWithGoogle();
      
}
