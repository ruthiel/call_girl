package org.academia;

/**
 * Created by ruthiel on 06-11-2016.
 */
public class Main {
    public static void main(String[] args) {

        CallGirl callGirl = new CallGirl();

        callGirl.addContact("Sofia", "919993767");
        callGirl.addContact("Jean", "894039876");
        callGirl.addContact("Sérgio", "912367458");
        callGirl.addContact("Bruno", "915678374");

        callGirl.createTask("Sofia", Priority.HIGH);
        callGirl.createTask("Sérgio", Priority.HIGH);
        callGirl.createTask("Ana", Priority.MEDIUM);
        callGirl.createTask("Jean", Priority.HIGH);
        callGirl.createTask("João", Priority.HIGH);

        while (callGirl.hasTasks()) {
            callGirl.call();
        }



    }
}
