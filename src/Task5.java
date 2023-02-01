public class Task5 {
/*
Create a method that will say Hello in different language based on the country
that will passed when method is executed

*/
   String sayingHello(String countryName) {
       switch (countryName) {
           case "Egypt":
               return "Salam";
           case "Mexico":
               return "Ola";
           case "France":
               return "Oui";
           case "China":
               return "Nihao";
           default:
               return "No Country";
       }
   }

    public static void main(String[] args) {
        Task5 task = new Task5();
        System.out.println(task.sayingHello("Egypt"));
        System.out.println(task.sayingHello("Libya"));
    }




}