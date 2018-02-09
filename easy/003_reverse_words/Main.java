import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = args[0];
        try {
			File file = new File(filename);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
                if(!line.equals("")) {
                    System.out.println(reverse(line));
                }
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public static String reverse(String line) {
        String arr[] = line.split(" ");
        String str = "";
        int i = 0;
        for(i = arr.length-1; i >= 0; i--) {
            str = str + arr[i];
            if(i != 0) {
                str += " ";
            }
        }
        return str;
    }
}