package FileChooser;

import java.io.*;

import java.util.Scanner;

public class BinaryStreamClassesExample {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        /* writing data to a file */
        BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("binstream.dat", true));
        System.out.println("Enter data to save");
        String data = new Scanner(System.in).nextLine();
        char[] chars = data.toCharArray();
        for (char c: chars){
            writer.write((byte)c);
        }
        writer.close();

        BufferedInputStream reader = new BufferedInputStream(new FileInputStream("binstream.dat"));
        int chars1;
        while ((chars1 =reader.read())!=-1){
            System.out.println((char) chars1);
        }

    }
}
