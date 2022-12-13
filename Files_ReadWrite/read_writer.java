package Files_ReadWrite;


public class read_writer {
    public static void main(String[] args) {
        Write write = new Write();
        write.Writer(10, 10);

        Read read = new Read();
        read.Reader();
    }
}
