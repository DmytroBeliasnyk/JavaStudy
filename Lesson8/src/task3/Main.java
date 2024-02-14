package task3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String folderPath = "D:\\JavaStudy";
        File myFolder = new File(folderPath);
        foundFolders(folderPath);
    }

    public static void foundFolders(String folderPath) {
        File folders = new File(folderPath);
        File[] listFolders = folders.listFiles();
        for (int i = 0; i < listFolders.length; i++) {
            if (listFolders[i].isDirectory()) {
                System.out.println(listFolders[i]);
            }
        }
    }
}