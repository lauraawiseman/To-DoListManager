package com.toDoListManager;

public class Task {
    String description;
    boolean isCompleted;
    Task next;

    // Constructors
    public Task(String description){
        this.description = description;
        this.isCompleted = false; // Setting false initially for new tasks
        this.next = null;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public boolean isCompleted(){
        return isCompleted;
    }

    public void markCompleted(){
        this.isCompleted = true;
    }

    @Override
    public String toString(){
        return (isCompleted ? "[x] " : "[ ] ") + description;
    }
}
