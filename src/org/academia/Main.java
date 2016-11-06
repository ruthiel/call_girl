package org.academia;

import java.io.IOException;

/**
 * Created by ruthiel on 06-11-2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        CallGirl callGirl = new CallGirl();

        System.out.println(callGirl.getPhoneBook());

        callGirl.addContact("Severino", "799877878");
    }
}
