import java.util.*;
 class CountOfdigitsinAnumber {
     public static void main(String[] args) {

         Scanner a =new Scanner(System.in );
         System.out.println("Enter the Number");
         long b= a.nextLong();

         int digit=0;
         while(b!=0){
             b= b/10;
             digit++;
         }
         System.out.println("Total no.Of digits in this number is :"+digit);
     }
}
