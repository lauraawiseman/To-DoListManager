package com.toDoListManager;

public class User {
    private String name;
    private TaskList taskList;

    public User(String name){
        this.name = name;
        this.taskList = new TaskList();
    }

    public String getName(){
        return name;
    }

    public void addTask(String description){
        Task newTask = new Task(description);
        taskList.addTask(newTask);
    }

    public void markTaskCompleted(int index){
        taskList.markTaskCompleted(index);
    }

    public void printTasks(){
        System.out.println("Tasks for " + name + ":");
        taskList.printTasks();
        System.out.println();
    }
}
