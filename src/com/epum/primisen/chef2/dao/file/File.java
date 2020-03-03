package com.epum.primisen.chef2.dao.file;

import java.io.BufferedReader;
import java.io.IOException;

//возможно FileReader джавы уже проверяет передаваемый путь на null.проверить это
public class File {

    private File() {
    }

    public static String read(String fileName) {

        StringBuilder stringBuilder = new StringBuilder();

        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new java.io.FileReader(fileName));

            try {
                String string;
                while ((string = bufferedReader.readLine()) != null) {
                    stringBuilder.append(string);
                }
            } finally {
                bufferedReader.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }
}
