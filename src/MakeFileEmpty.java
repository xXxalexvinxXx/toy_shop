import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class MakeFileEmpty {
    static String file = "prizes.txt";
    public static void MakeFileEmpty() throws FileNotFoundException{
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();
    }

}
