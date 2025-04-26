package TaskService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskServiceTest {

	@Test
	void testAddTask() {
		//tests to see if the task can be add
		TaskService taskService = new TaskService();
		Assertions.assertTrue(taskService.addTask(new Task("1","James Krik","This is the description")));
	}
	@Test
	void testDeleteTask() {
		//tests to see if the task is deleted from the list
		TaskService taskService = new TaskService();
		taskService.addTask(new Task("2","Do things","This is the description"));
		Assertions.assertTrue(taskService.deleteTask("2"));
	}
	@Test
	void testUpdateTaskName() {
		//tests to see if the task name is updated
		TaskService taskService = new TaskService();
		taskService.addTask(new Task("3","Do things","This is the description"));
		taskService.updateTaskName("3", "Do new things");
		assertEquals("Do new things", taskService.getTask("3").getName());
	}
	@Test
	void testUpdateTaskDesc(){
		//tests to see if the task description is updated
		TaskService taskService = new TaskService();
		taskService.addTask(new Task("4","Do Things","This is the description"));
		taskService.updateTaskDesc("4", "This is the new description");
		assertEquals("This is the new description", taskService.getTask("4").getDesc());
		
		}
}
