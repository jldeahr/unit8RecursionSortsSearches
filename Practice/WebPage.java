import java.util.Scanner;
import java.net.URL;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Reads information from a webpage and copies it to a file
 * 
 * @author jldeahr 
 * @version date 3/11/2015
 */
public class WebPage
{
    public static void main(String[] args) throws IOException
    {
        Scanner adr = new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String address = adr.next();
        
        URL pg = new URL(address);
        Scanner in = new Scanner(pg.openStream());
        
        PrintWriter out = new PrintWriter("output.txt");
        while (in.hasNextLine())
        {
            out.println(in.nextLine());
        }
        System.out.println("Source Copied!");
        
        in.close();
        out.close();
        adr.close();
    }
}
