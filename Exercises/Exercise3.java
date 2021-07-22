import java.io.*;

public class Exercise3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader("input.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }
}
