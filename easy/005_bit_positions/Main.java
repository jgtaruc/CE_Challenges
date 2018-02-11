import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String filename = args[0];
        try {
            File file = new File(filename);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while(line != null) {
                if(!line.equals("")) {
                    String arr[] = line.split(",");
                    int n = Integer.parseInt(arr[0]);
                    int p1 = Integer.parseInt(arr[1]);
                    int p2 = Integer.parseInt(arr[2]);
                    System.out.println(bitsPosition(n, p1, p2));
                }
                line = bufferedReader.readLine();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static String Binaryfy(int n) {
        String binary = "";
        while(true) {
            int q = n/2;
            int r = n%2;
            binary = Integer.toString(r) + binary;
            n = q;
            if(q == 0) {
                break;
            }
        }
        return binary;
    }

    public static boolean bitsPosition(int n, int p1, int p2) {
        String binary = Binaryfy(n);
        return binary.charAt((binary.length()-p1)) == binary.charAt((binary.length()-p2));
    }
}