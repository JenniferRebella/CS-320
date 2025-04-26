package TaskService;


import java.util.ArrayList;

public class TaskService{
	
	//array list to hold the tasks
	private ArrayList<Task> list;
	
	//gets the task from the list and returns it or null if not found
	public Task getTask(String id) {
		
		for(Task t : list) {
			
			if(t.getId().equalsIgnoreCase(id)) {
				
				return t;
				
			}
			
		}
		
		return null;
		
	}
	//Adds the contact if the list size is zero or if the id is not a duplicate and will return
	//true if add or false if it was not added
	//if a id is a duplicate an illegal argument exception will be thrown
	public boolean addTask(Task task) {
		
		boolean didAdd = false;

		if(list.size()==0) {
			list.add(task);
			didAdd = true;
		}
		else {
			for(Task t : list) {
				if(task.getId().equalsIgnoreCase(t.getId())) {
					throw new IllegalArgumentException("Duplicate id");
				}
			}
			list.add(task);
			didAdd = true;
		}
	return didAdd;
	}
	//deletes the task based on searching the list for the id
	// if the task is deleted it will return true 
	//else it will return false
	
	public boolean deleteTask(String id) {
		for (Task t : list) {
			if(id.equalsIgnoreCase(t.getId())){
				list.remove(t);
				return true;
			}
		}
		return false;
	}
	//updates the name by searching the list for the id
	//if the name is updated it will return true 
	//else it will return false
	
	public boolean updateTaskName( String id, String updatedName) {
		for(Task t : list) {
			if(id.equalsIgnoreCase(t.getId())){
				t.setName(updatedName);
				return true;
			}
		}
		return false;

	}
	//updates the desc by searching the list for the id
	//if the desc is updated it will return true 
	//else it will return false
	
	public boolean updateTaskDesc( String id, String updatedDesc) {
		for(Task t : list) {
			if(id.equalsIgnoreCase(t.getId())){
				t.setDesc(updatedDesc);
				return true;
			}
		}
		return false;

	}
	
}