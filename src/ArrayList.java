import java.util.ArrayList;
import java.util.List;
  
public class ArrayList{
  
    public static void main(String[] args)
    {
        // create ArrayList
        ArrayList<String> ArrList = new ArrayList<String>();
  
        // Adding elements to the ArrayList
        ArrList.add("item 1");
        ArrList.add("item 2");
        ArrList.add("item 3");
  
        System.out.println("ArrayList = " + ArrList);
  
        // create List
        List<String> ListItem = new ArrayList<String>();
        ListItem.add("item 4");
        ListItem.add("item 5");
  
        // add List items in ArrayList
        ArrList.addAll(ListItem);
  
        System.out.println(
            "After Adding List Item in ArrayList = "+ ArrList);
    }
}