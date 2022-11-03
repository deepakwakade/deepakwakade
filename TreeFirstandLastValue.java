package Collection.com;
import java.util.TreeMap;

public class TreeFirstandLastValue {
   public static void main(String[] args) {
      System.out.println("(StudentList.java)!\n");
      TreeMap <Integer, String>tMap = new TreeMap<Integer, String>();
      tMap.put(1, "Deepak");
      tMap.put(2, "Robet");
      tMap.put(3, "Doney");
      tMap.put(4, "Junior");
      tMap.put(5, "Peter");
      tMap.put(6, "Parker");
      tMap.put(7, "Chris");
      System.out.println("Keys of tree map: " + tMap.keySet());
      System.out.println("Values of tree map: " + tMap.values());
      System.out.println(" ");

      System.out.println(
         "First element of ArryList Student: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()));
      System.out.println(
         "Last element of ArryList Student:  " + tMap.lastKey() + " Value: "+ tMap.get(tMap.lastKey()));

   }
}
