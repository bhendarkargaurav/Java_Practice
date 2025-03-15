
// pring a name(String) using array

import java.util.*;
public class array3{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String name [] = new String[size];

        // for the input
        for(int i=0; i<size; i++){
            name[i] = sc.next();
        }

        // for output
        for(int i=0; i<name.length; i++){
            System.out.println( "name" + (i+1) + " is :" + name[i]);
        }


    }
}