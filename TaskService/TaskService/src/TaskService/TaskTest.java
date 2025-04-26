package TaskService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {

	@Test
	void testTaskConstructorPass() {
		//tests the task constructor to see if it will create the task
		String id ="5";
		String name = "Do things";
		String desc = "This is the description";
		Task testTask =  new Task(id, name, desc);
		assertEquals("5", testTask.getId());
		
	}
	@Test
	void testTaskConstructorFail() {
		//test the task constructor to see if it will throw an illegal argument
		String id = null;//id can not be null
		String name = "Do things";
		String desc = "This is the description";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(id, name, desc);
		});

	}
	@Test
	void testTaskIdLonger() {
		//tests to see if an illegal argument is thrown when the id is longer than 10 characters
		String id ="01234567891";
		String name = "Do things";
		String desc = "This is the description";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(id, name, desc);
		});
	}
	@Test
	void testTaskIdNull() {
		//tests to see if an illegal argument is thrown when the id is null
		String id = null;
		String name = "Do things";
		String desc = "This is the description";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(id, name, desc);
		});
	}
	@Test
	void testTaskNameLonger() {
		// tests to see if an illegal argument is throw when the name is longer than 20 characters
		String id ="7";
		String name = "Do things but this is going to be waaaaayyyy over 20 characters";
		String desc = "This is the description";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(id, name, desc);
		});
	}
	@Test
	void testTaskNameNull() {
		// tests to see if an illegal argument is throw when the name is null
		String id ="8";
		String name = null;
		String desc = "This is the description";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(id, name, desc);
		});
	}
	@Test
	void testTaskDescLonger() {
		//tests to see if an illegal argument is thrown when the desc is longer than 50 characters
		String id = "9";
		String name = "Do things";
		String desc = "This is the description but it is waaaaayyyyy over the limit of only 50 characters";
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(id, name, desc);
		});
	}
	@Test
	void testTaskDescNull() {
		//tests to see if an illegal argument is thrown when the desc is null
		String id = "10";
		String name = "Do things";
		String desc = null;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(id, name, desc);
		});
	}
}
