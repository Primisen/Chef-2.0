package com.epum.primisen.chef2.utility.read_file;

public class FileReader {


    //проверять на null путь
    private String filePath;

    public FileReader(String filePath){
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
