package org.academia;

/**
 * Created by ruthiel on 06-11-2016.
 */
public class Task implements Comparable<Task>{

    private String name;
    private Priority priority;

    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task that) {
        return this.priority.ordinal() - that.priority.ordinal();
        // Aqui utilizo um método já existente na classe enum:
        //return this.priority.compareTo(that.priority);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
