# 📋 To-Do List Manager

A simple command-line To-Do List Manager built in Java for a Sprint project in **Datastructures & Algorithms**.
Each user has their own personal to-do list stored as a singly linked list of tasks. Users are stored in an array.

## 🛠️ Technologies Used
- Java 23
- IntelliJ IDEA
- No external libraries

---

## ✅ Features

- Create multiple users (stored in an array)
- Add tasks to each user's personal task list
- Mark tasks as completed
- View tasks with their completion status
- Uses a custom singly linked list

---

## 🔍 Class Overview

### `Task`
- Represents a single to-do item
- Fields: `description`, `isCompleted`, `next`
- Method to mark a task as completed

### `TaskList`
- Custom singly linked list implementation
- Stores a linked list of `Task` objects
- Methods to:
  - Add tasks
  - Mark tasks as completed (by index)
  - Print all tasks

### `User`
- Represents a single user
- Fields: `name`, `TaskList`
- Methods to:
  - Add a task
  - Mark a task completed
  - Print tasks

### `Main`
- Creates and stores users in an array
- Adds tasks to each user's list
- Marks tasks as completed
- Prints all tasks per user

---

## 🚀 How to Run

1. Open the project in IntelliJ IDEA
2. Navigate to `Main.java`
3. Run the `main()` method
4. View printed output in the terminal


