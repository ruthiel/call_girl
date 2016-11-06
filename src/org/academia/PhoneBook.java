package org.academia;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ruthiel on 06-11-2016.
 */
public class PhoneBook {

    private Map<String, String> phoneList;

    public PhoneBook() {
        phoneList = new HashMap<>();
    }

    public void add(String name, String number) {
        phoneList.put(name, number);
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
}
