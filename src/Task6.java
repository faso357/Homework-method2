public class Task6 {
/*
 Write a method to return whether given number is prime or not?

*/
boolean primeNum(int number){
   boolean flag = true;
   if(number>1){
       for (int i = 2; i < number; i++) {
           if(number%i==0){
               flag = false;
               break;
           }
       }
   }else{
       flag=false;
   }
   return flag;
   }

    public static void main(String[] args) {
Task6 task = new Task6();
        System.out.println(task.primeNum(13));
        System.out.println(task.primeNum(10));

}}