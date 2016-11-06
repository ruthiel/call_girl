package org.academia;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by ruthiel on 06-11-2016.
 */
public class CallGirl {

    private PhoneBook phoneBook;
    private Queue<Task> taskList;

    public CallGirl() {
        taskList = new PriorityQueue<>();
        phoneBook = new PhoneBook();
    }

    public void createTask(String name, Priority priority) {
        taskList.offer(new Task(name, priority));
    }

    public void call() {

    }

    public void addContact(String name, String number) {
        phoneBook.add(name, number);


    }


}
