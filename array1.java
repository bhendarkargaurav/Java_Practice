// import java.util.*;

// import javax.print.attribute.standard.OutputDeviceAssigned;

// public class array1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // size of array
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         // input value for array      
//         for(int i=0; i<size; i++){    
//             numbers[i] = sc.nextInt();
//         }

//         // for Output
//         for(int i=0; i<size; i++){
//             System.out.print(numbers[i]);
//         }     
//  }
// }

import java.util.*;
public class array1{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
           System.out.println( numbers[i] );
        }

        
        
    }
}