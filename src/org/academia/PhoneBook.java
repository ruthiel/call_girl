package org.academia;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ruthiel on 06-11-2016.
 */
public class PhoneBook {

    private Map<String, String> phoneList;

    public PhoneBook() throws IOException {
        phoneList = new HashMap<>();
        loadContacts();
    }

    private void loadContacts() throws IOException {
        FileManager fileManager = new FileManager("resources/PhoneBook.txt");

        String line = "";


        while ((line = fileManager.readLine()) != null ) {
            String[] contact = line.split(",");
            phoneList.put(contact[0], contact[1]);
        }
    }

    public boolean add(String name, String number) throws IOException {
        if (phoneList.containsKey(name)) {
            return false;
        }

        phoneList.put(name, number);
        saveContacts();
        return true;

    }

    public String mapToString() {
        String result = "";

        phoneList.keySet();

        for ( String key : phoneList.keySet()) {
            result += key + "," + phoneList.get(key)+ "\n";
        }

        return result;

    }

    private void saveContacts() throws IOException {
        FileManager.write(mapToString(), "resources/PhoneBook.txt");


    }


    @Override
    public String toString() {
        return phoneList.toString();
    }

    public boolean hasName(String name) {
        return phoneList.containsKey(name);
    }

    public String getNumber(String name) {
        return phoneList.get(name);
    }

    public Map<String, String> getMap() {
        return phoneList;
    }
}
