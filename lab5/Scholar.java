package lab5;
import java.util.*;
public class Scholar {
    static void main(String[] args) {
      final int SIZE=12;
      int[] marks=new int[SIZE];
      double avg=0;

      int full=0;
      int half=0;
      int zero=0;
      int belowavg=0;
      Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks: ");
      for(int i=0;i<SIZE;i++){
         marks[i]=sc.nextInt();
      }
      for(int i=0;i<SIZE;i++){
          if(marks[i]<40){
              marks[i]=40;
          }
      }
      int sum=0;
      for(int i=0;i<SIZE;i++){
          sum+=marks[i];
      }
      avg=(double) sum/SIZE;

      for(int i=0;i<SIZE;i++){
          if(marks[i]>85){
              full++;
          }else if(marks[i]<85 && marks[i]>70){
              half++;
          }else{
              zero++;
          }
          if(marks[i]<avg){
              belowavg++;
          }
      }
        System.out.println("\nClass Average: " + avg);
        System.out.println("Full Scholarships (Above 85): " + full);
        System.out.println("Half Scholarships (70 - 85): " + half);
        System.out.println("No Scholarships (Below 70): " + zero);
        System.out.println("Students below class average: " + belowavg);

    }
}
