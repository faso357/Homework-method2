public class Task4 {
/*
Create a method that will print whether given String is palindrome or not.

*/
   void isPalindrome(String str ){
       StringBuilder st = new StringBuilder();
       st.reverse();
       String revesedStr = st.toString();
       if(str.equals(revesedStr)){
           System.out.println(str+" is Palindrome");
       }else{
           System.out.println(str+" is not palindrome");
       }
        }

    public static void main(String[] args) {
        Task4 task = new Task4();
        task.isPalindrome("dad");




}}