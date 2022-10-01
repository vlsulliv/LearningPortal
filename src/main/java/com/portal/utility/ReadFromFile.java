package com.portal.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    File file = new File("C:\\WorkSpace\\WorkPlace\\LearningPortal\\config");


    public File readAllLines(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        sc.useDelimiter("=");
        System.out.println(sc.next());
        return file;
    }
}
