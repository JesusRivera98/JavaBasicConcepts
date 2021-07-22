import java.io.*;

public class Exercise3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String str;
        FileReader file = new FileReader("input.txt");
        BufferedReader buffer = new BufferedReader(file);
        while((str = buffer.readLine())!=null) {
            System.out.println(str);
        }
        buffer.close();
    }
}
