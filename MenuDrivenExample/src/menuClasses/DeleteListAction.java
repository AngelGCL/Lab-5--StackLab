package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteListAction implements Action {

	@Override
	public void execute(Object args) {
		// TODO Auto-generated method stub

		DMComponent dm = (DMComponent) args; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nDeleting a new list of Integer values from the system:\n"); 
		String listName = io.getInput("\nEnter name of new list: "); 
		dm.removeList(listName); 
	}

}
