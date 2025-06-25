package com.toDoListManager;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[3];

        users[0] = new User("Laura");
        users[1] = new User("Jim");
        users[2] = new User("Claire");

        users[0].addTask("Buy groceries");
        users[0].addTask("Clean the bathroom");
        users[0].addTask("Complete homework");

        users[1].addTask("Clean bedroom");
        users[1].addTask("Take out the recycling");
        users[1].addTask("Go to the gym");

        users[2].addTask("Eat lunch");
        users[2].addTask("Clean the pool");
        users[2].addTask("Finish homework");

        users[0].markTaskCompleted(1);
        users[1].markTaskCompleted(1);
        users[2].markTaskCompleted(1);
        users[2].markTaskCompleted(2);

        for (User user : users){
            user.printTasks();
        }
    }
}