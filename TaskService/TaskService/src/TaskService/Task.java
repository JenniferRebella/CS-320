package TaskService;

public class Task{
	
	private String id;
	
	private String name;
	
	private String desc;
	// sets up the task and the requirements
	public Task(String id, String name, String desc){
		
		//if the id is null or more than 10 characters, an illegal argument exception will be throw
			if(id == null|| id.length()>10) {
			
				throw new IllegalArgumentException("Invalid id");
			
			}
			
			//if the name is longer than 20 characters or null an illegal argument exception is thrown
			if(name == null|| name.length()>20) {
				
				throw new IllegalArgumentException("Invalid name");
				
			}
			
			//if the description is longer than 50 or null an illegal argument is thrown
			if(desc == null|| desc.length()>50) {
				
				throw new IllegalArgumentException("Invalid desc");
			}
			
			//sets the approved id name and description
			this.id = id;
			
			this.name = name;
			
			this.desc = desc;
			
	}
	
	//getters and setters
	public String getId() {
		
		return id;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public String getDesc() {
		
		return desc;
		
	}
	
	public void setId(String id) {
		
		if(id == null|| id.length()>10) {
			
			throw new IllegalArgumentException("Invalid id");
			
		}
		
		this.id = id;
		
	}
		
	public void setName(String name) {
			
		if(name == null|| name.length()>20) {
				
				throw new IllegalArgumentException("Invalid name");
				
			}		
		
		this.name = name;
		
	}
	
	public void setDesc(String desc) {
		
		if(name == null|| name.length()>50) {
			
			throw new IllegalArgumentException("Invalid desc");
			
		}
		
		this.desc = desc;
	
	}
	
}