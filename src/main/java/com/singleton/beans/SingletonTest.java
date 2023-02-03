package com.singleton.beans;

public class SingletonTest {
	public static void main(String[] args) {
		ToDoManager toDoManager = new ToDoManager();
		toDoManager.manage();

		JobScheduler jobScheduler = new JobScheduler();
		jobScheduler.execute();
	}
}
