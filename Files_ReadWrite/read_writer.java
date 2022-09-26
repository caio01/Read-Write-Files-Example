package Files_ReadWrite;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class read_writer {
    public static void main(String[] args) {
        Writer(10, 10);
        Reader();
    }

    public static void Writer(int numLines, int numColumns) {
        try {
            FileOutputStream file = new FileOutputStream("file.txt");
            PrintWriter pr = new PrintWriter(file);

            for (int i = 0; i < numColumns; i++) {
                for (int j = 0; j < numLines; j++) {
                    pr.print(i + ":" + j + "   ");
                }
                pr.println();
            }

            pr.close();
            file.close();

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }

    public static void Reader() {
        try {
            FileInputStream file = new FileInputStream("file.txt");
            InputStreamReader input = new InputStreamReader(file);
            BufferedReader br = new BufferedReader(input);

            String line;

            do {
                line = br.readLine();
                if (line != null) {
                    System.out.println(line);
                }
            } while (line != null);

            br.close();

        } catch (Exception e) {
            System.out.println("Error writing file");
        }
    }
}
