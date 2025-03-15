
// que take an array as input from user and search for a given number x and 
// print the index at which it occurs

import java.util.*;
public class array2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers [] = new int[size];

        // code for Input
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        // code for finding the number on index
        int x = sc.nextInt();
        

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.println("x is found at index:" +i);
            }
        }
}
}


