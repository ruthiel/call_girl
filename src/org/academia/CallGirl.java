package org.academia;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by ruthiel on 06-11-2016.
 */
public class CallGirl {

    private PhoneBook phoneBook;
    private Queue<Task> taskList;
    private boolean hasTasks;

    public CallGirl() {
        hasTasks = true;
        taskList = new PriorityQueue<>();
        phoneBook = new PhoneBook();
    }

    public void createTask(String name, Priority priority) {
        taskList.offer(new Task(name, priority));
    }

    public void call() {
        Task nextTask = taskList.poll();

        if ( nextTask == null) { //se for nulo o name não tem um NullPointerEcxeption
            hasTasks = false;
            return;
        }

        String name = nextTask.getName();

        if (phoneBook.hasName(name)) {
            System.out.println("Calling to " + name + " with the number " + phoneBook.getNumber(name));
        } else {
            System.out.println("This name doesn't exist in my records.");
        }
    }


    public void addContact(String name, String number) {
        phoneBook.add(name, number);


    }


    public boolean hasTasks() {

        return hasTasks;
    }
}
