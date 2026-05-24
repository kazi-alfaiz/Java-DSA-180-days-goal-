package Methods;

public class mainmethod {
    static void main() {
//        Print2STable();
//        sum(10,21);

add(1,23);


//        System.out.println(add(1,23));
//
//
//        System.out.println(add(2,23,23));


        int num =5;
        System.out.println(num +"Firts num");
        solv( num);
        System.out.println(num +"Seconds num");
     }
    static void Print2STable(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i*2);
        }}

    static void sum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }

    static int add(int s,int v){
        int sum=s+v;
      return sum;
    }
static int add(int a,int b,int c){
        int sum =a+b+c;

        return sum;
}

static void solv(int num){

    System.out.println("num before changing "+num);
    num= num*10;
    System.out.println("num after changing "+num);
}



}
