package com.toDoListManager;

public class TaskList {
    private Task head;

    // Constructors
    public TaskList() {
        head = null;
    }

    public void addTask(Task task) {
        if (head == null) {
            head = task;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = task;
        }
    }

    public void markTaskCompleted(int index) {
        Task current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                current.markCompleted();
                System.out.println("Task " + index + " marked as complete!");
                return;
            }
            current = current.next;
            count++;
        }
        System.out.println("Task index " + index + "does not exist. Please try again.");
    }

    public void printTasks(){
        if (head == null){
            System.out.println("No tasks to display");
            return;
        }
        Task current = head;
        int index = 0;

        while (current != null){
            System.out.println(index + ". " + current.toString());
            current = current.next;
            index++;
        }
    }
}






