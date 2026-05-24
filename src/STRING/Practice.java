package STRING;

public class Practice {

    static String reverseString(String str){

        String Reverse="";
        int n=str.length();
        for (int i =n-1; i >=0 ; i--) {
           char ch=str.charAt(i);

           Reverse=Reverse+ch;
        }
        return Reverse;
    }


/*    static int getVowelsCount(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
         char ch = word.charAt(i);
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
             count++;
         }
        }return  count;
    }*/







/*
    static void PrintString(String str) {

        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch
            );
        }
    }


    static int PrintCharlenght(String str) {
        char[] arr = str.toCharArray();
        int len=arr.length;
        return len;
    }
*/


    static void main() {

        String str = "alfaiz";
        System.out.println(reverseString(str));

/*
        System.out.println(getVowelsCount(str));
*/

       /* PrintString(str);

        System.out.println(PrintCharlenght(str));*/

    }



}
