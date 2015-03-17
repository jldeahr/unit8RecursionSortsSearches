import java.util.ArrayList;

public class ListMethodsRunner
{
   public static void main(String[] args)
   {
      ArrayList<Integer> tempList = null;
      if (tempList.size() == 0 || tempList == null)
      {
          System.out.println("The list is empty");
      }
      else
      {
         for (int i = 0; i < tempList.size(); i++)
         {
            System.out.println(tempList.get(i));
         }
      }
   }
}