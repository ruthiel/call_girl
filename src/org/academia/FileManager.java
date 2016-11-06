package org.academia;

import java.io.*;

/**
 * Created by ruthiel on 06-11-2016.
 */
public class FileManager {

    private BufferedReader bReader;


    public FileManager(String path) throws FileNotFoundException {
        this.bReader = new BufferedReader(new FileReader(path));
    }

    public String readLine() throws IOException {

        String line = bReader.readLine();

        return line;
    }

    public static void write(String contact, String path) throws IOException {

        BufferedWriter bWriter = new BufferedWriter(new FileWriter(path));

        bWriter.write(contact);
        bWriter.flush();
        bWriter.close();

    }
}
