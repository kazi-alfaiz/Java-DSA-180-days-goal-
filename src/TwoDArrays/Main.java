package TwoDArrays;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);


        int arr[][]= {
                {1, 2, 3},
                {21, 20, 19}
                } ;

        int maxValue=arr[0][0];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println("The maximum value is " + maxValue);

        int minValue=arr[0][0];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] < minValue) {
                    minValue = arr[i][j];
                }
            }
        }
        System.out.println("The minimum value is " + minValue);



/*

        int arr[][]= {
                {1, 2, 3},
                {1, 2, 3}
        };
int ans=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val = arr[i][j];
                ans = ans * arr[i][j];
            }}
        System.out.println(ans);
*/

/*
        };
int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
          int value=arr[i][j];
          sum+=value;
            }
        }
        System.out.println(sum);
*/






      /*  int arr[][];
        arr =new int[3][4];
        // n<= arr.lenght-1 or n<arr.lenth
        for (int i = 0; i <=arr.length-1; i++) {
            for (int j = 0; j <=arr[i].length-1 ; j++) {
                System.out.println("Provide value of row "+i+" and column "+j );
                arr[i][j] = sc.nextInt();
            }
        }


        for (int rowIndex = 0; rowIndex < arr.length; rowIndex++) {
for (int columnIndex = 0; columnIndex < arr[rowIndex].length; columnIndex++) {
    System.out.print(arr[rowIndex][columnIndex]+" ");
}
            System.out.println();
        }*/



       /* int brr [][]={
                {1,2},
                {2,3,3,4,5},
                {3,4,6,8,9},
                {4,5}
        };


        for (int rowIndex = 0; rowIndex < brr.length ; rowIndex++) {
            for (int colIndex = 0; colIndex < brr[rowIndex].length; colIndex++) {
                System.out.print(brr[rowIndex][colIndex]+" ");

            }
            System.out.println();
        }
        */
        
        
        
        
        
        
        
        
      /*  
        int arr [][];

        arr = new int[3][4];
*/
//        int brr [][]={
//                {1,2},
//                {2,3,3,4,5},
//                {3,4,6,8,9},
//                {4,5}
//        };
//int n=brr.length;
////int m=brr[0].length;
//        for (int row = 0; row <n ; row++) {
//            int collenght= brr[row].length;
//            for (int j = 0; j <collenght; j++) {
//
//                System.out.print(brr[row][j]+" ");
//            }
//            System.out.println();
//        }


    }
}
