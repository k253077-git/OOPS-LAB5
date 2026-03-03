package lab5;

import java.util.Arrays;

public class Arraycompa {
    static void main(String[] args) {
        int[] arr1={10,20,30,40};
        int[] arr2={30,40,50,60};

        System.out.println("\nUnion:");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        for(int i = 0; i < arr1.length; i++) {
            boolean found = false;

            for(int j = 0; j < arr2.length; j++) {
                if(arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.print(arr2[i] + " ");
            }
        }

        System.out.println("\nIntersection");
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]+"");
                    break;
                }
            }
        }
        String[] names = {"Amna","Ali","Aqsa","Sana"};
        Arrays.sort(names);   // Sorting
        System.out.println("Sorted Array:");    // sorting
        for(String name : names) {
            System.out.println(name);
        }
    }
}
