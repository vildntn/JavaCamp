package fifthAssignmentJavaCamp.core.concreates;

import fifthAssignmentJavaCamp.core.abstracts.GoogleService;
import fifthAssignmentJavaCamp.google.AuthWithGoogle;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void authToSystem() {
		AuthWithGoogle auth=new AuthWithGoogle();
		auth.auth();
		
	}

}
