package com.epum.primisen.chef2.utility.read_file;

import com.epum.primisen.chef2.utility.read_file.FileReader;

import java.io.BufferedReader;
import java.io.IOException;


//возможно FileReader джавы уже проверяет передаваемый путь на null.проверить это
public class FileReaderLogic {

    private FileReader fileReader;

    public FileReaderLogic(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public String read() {

        String fileName = fileReader.getFilePath();

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
