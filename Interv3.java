public class Interv3 {

    int f(int n){
        if(n<=2){
            return 1;
        }else{
            return f(n-1) + f(n-2);
        }
    }

   public static void main(String[] args) {
 
    //    int i ;
/*       int reverse =0;
       int num = 121; //Second value store is 23
       int temp  =num;
       while(num>0){
       int   a = num%10;//first value store 2;second value is like 3;
       reverse = (reverse*10) +a;//first value store  = 2;//second value is like 23;
       num = num/10;//23
       }if(temp == reverse){
       System.out.println(reverse);
       }else{
           System.out.println("not palidrom");
       }
    }*/
    
    Interv3 g = new Interv3();
    System.out.println(g.f(4));
    System.out.println(g.f(6));
     
} 
}
