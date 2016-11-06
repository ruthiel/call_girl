package org.academia;

/**
 * Created by ruthiel on 06-11-2016.
 */
public class Main {
    public static void main(String[] args) {

        CallGirl callGirl = new CallGirl();

        callGirl.createTask("Sérgio", Priority.HIGH);
        callGirl.createTask("Sofia", Priority.LOW);
        callGirl.createTask("Jean", Priority.HIGH);
        callGirl.createTask("Antoninho", Priority.MEDIUM);
        callGirl.createTask("Naruto", Priority.HIGH);
        callGirl.createTask("Benedita", Priority.LOW);

        System.out.println(callGirl.testRemove());
        System.out.println(callGirl.testRemove());
        System.out.println(callGirl.testRemove());
        System.out.println(callGirl.testRemove());
        System.out.println(callGirl.testRemove());
        System.out.println(callGirl.testRemove());
        System.out.println(callGirl.testRemove());


    }
}
