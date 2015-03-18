import java.util.*;

public class ListMethods
{
    public static ArrayList makeList(int n)
    {
        ArrayList tempList = new ArrayList();
        if (n <= 0)  // The smallest list we can make
        {
            return tempList;
        }
        else        // All other size lists are created here
        {
            tempList.add(n);
            makeList(n-1);
        }
        return tempList;
    }
    
    public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (Integer i : tList)
        {
            list.add(new Integer(i));
        }
        return list;
    }

    public static ArrayList reverseList(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = ListMethods.deepClone(tList);
        int ex;
        int x = 0;
        if (list.size() <= 1)
        {
            return list;
        }
        else
        {
            ex = list.get(x);
            list.remove(x);
            list.add(list.size()-1, ex);
            x++;
        }
        return list;
    }
}
