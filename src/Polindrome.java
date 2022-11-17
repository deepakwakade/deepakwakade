public class Polindrome{

//method to check if a string is polindrome
public static boolean validPolindrome(String s) {
       for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
           if (s.charAt(i) != s.charAt(j)) {
               return false;
           }
       }
       return true;
   }

   public static void main(String[] args) {
       String s1 = "level";
       String s2 = "cool";
       String s3 = "Madam";
       String s4 = "Now, sir, a war is won!";
       boolean b1 = validPolindrome(s1);
       boolean b2 = validPolindrome(s2);
       boolean b3 = validPolindrome(s3);
       boolean b4 = validPolindrome(s4);
       System.out.println("is " + s1 + " a polindrome? " + b1);
       System.out.println("is " + s2 + " a polindrome? " + b2);
       System.out.println("is " + s3 + " a polindrome? " + b3);
       System.out.println("is " + s4 + " a polindrome? " + b4);


   }

}
