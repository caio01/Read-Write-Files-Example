package Files_ReadWrite;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Write {
    public Write() {}

    public void Writer(int numLines, int numColumns) {
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
}