package org.academia;

import java.io.IOException;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by ruthiel on 06-11-2016.
 */
public class CallGirl {

    private PhoneBook phoneBook;
    private Queue<Task> taskList;

    public CallGirl() throws IOException {
        taskList = new PriorityQueue<>();
        phoneBook = new PhoneBook();
    }

    public void createTask(String name, Priority priority) {
        taskList.offer(new Task(name, priority));
    }

    public void call() {
        Task nextTask = taskList.poll();

        if ( nextTask == null) { //se for nulo o name não tem um NullPointerEcxeption
            System.out.println("I don't have more tasks to do.");
            return;
        }

        String name = nextTask.getName();

        if (phoneBook.hasName(name)) {
            System.out.println("Calling to " + name + " with the number " + phoneBook.getNumber(name));
        } else {
            System.out.println("This name doesn't exist in my records.");
        }
    }


    public void addContact(String name, String number) throws IOException {
        phoneBook.add(name, number);


    }


    public boolean hasTasks() {
        return !taskList.isEmpty();
    }

    public Map<String, String> getPhoneBook() {
        return phoneBook.getMap();
    }

}
