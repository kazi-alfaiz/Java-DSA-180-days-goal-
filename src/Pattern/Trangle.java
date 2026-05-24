package Pattern;

public class Trangle {
    static void main() {
//        for (int row = 1; row <=5 ; row++) {
//            for (int col = 1; col <=row ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



        /*int n = 5;

        for (int row = 1; row <=5 ; row++){
            //for each row variable colm
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

//
//int n = 5;
//
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <= n-row; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <=2*row-1 ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//                 int n =4;
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <=row-1 ; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <=2*n-2*row+1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n= 4;
//
//        for (int row =1; row <=n ; row++) {
//            for (int col = 1; col <=6 ; col++) {
//                if (row==1 || row ==n){
//                    System.out.print("* ");
//                }else {
//                    if (col==1 || col ==6){
//                        System.out.print("* ");
//                    }else  {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }


        //patter 09
        /*     int n=10;
        for (int row = 1; row <=n ; row++) {
            if (row == 1 || row==2 || row ==n) {
                for (int col = 1; col <=row ; col++) {
                    System.out.print("* ");
                }
            }else {
                //middel row
                System.out.print("* ");

                // (row-2) space
                for (int col = 1; col <=(row-2) ; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }*/

  /*      int n = 5;
        for (int row = 1; row <= n; row++) {
            //part 1
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            //part2
            if (row ==1|| row==n){
                for (int col =1; col <=2*row-1 ; col++) {
                    System.out.print("* ");
                }
            }else {
                //middle row
                //1*
                System.out.print("*");
                for (int col = 1; col <=2*row-3 ; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");


            }
            System.out.println();

        }*/
/*

        int n = 5;
//part 1
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=2*row-1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

              //   int n =4;
        //part 2
        for (int row = 1; row <=n ; row++) {
            if (row ==1){
                continue;
            }
            for (int col = 1; col <=row-1 ; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <=2*n-2*row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

*/

        int n = 4;
        for (int row = 1; row <= n; row++) {
            //part 1
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            //part2
            if (row ==1){
                for (int col =1; col <=2*row-1 ; col++) {
                    System.out.print("* ");
                }
            }else {
                //middle row
                //1*
                System.out.print("* ");
                for (int col = 1; col <=2*row-3 ; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");


            }
            System.out.println();

        }


        for (int row = 1; row <(n) ; row++) {
         //part 1
         for (int col = 1; col <=row ; col++) {
             System.out.print("  ");
         }

         //part2
if (row==(n-1)){
    System.out.print("* ");
}else{

    System.out.print("* ");
    for (int col = 1; col <=2*(n-row)-3 ; col++) {
        System.out.print("  ");
    }
    System.out.print("* ");
}


            System.out.println();
        }


    }
}
