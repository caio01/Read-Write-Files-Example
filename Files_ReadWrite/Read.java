package Files_ReadWrite;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Read {
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