package Files_ReadWrite;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Write {
    public static void Writer() {
        try {
            FileOutputStream file = new FileOutputStream("file.txt");
            PrintWriter pr = new PrintWriter(file);

            pr.println("Linha1 Coluna1 ; Linha1 Coluna2; Linha1 Coluna3");

            pr.close();
            file.close();

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}