import java.util.*;

public class ListMethods
{
    public static ArrayList makeList(int n)
    {
        ArrayList tempList = null;
        if (n <= 0)  // The smallest list we can make
        {


        }
        else        // All other size lists are created here
        {
            makeList(n-1);

        }
        return tempList;
    }

    public static ArrayList reverseList(ArrayList list)
    {

    }
}