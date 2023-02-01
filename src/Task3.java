public class Task3 {
/*
Create a method that will take a number and prints whether the number is even or odd.

*/
    boolean isEven(int number ){
        if (number%2==0){
        return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Task3 num = new Task3();
        System.out.println(num.isEven(13));
    }






}