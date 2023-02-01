public class Task1 {
/*
Create a method createEmail(). Based on values of users name, lastName and email type,
your method should return complete email Address.
Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or

*/

    String createEmail(String name , String lastName , String Email) {
        return name + lastName + "@" + Email + ".com";

    };


    public static void main(String[] args) {
        Task1 task = new Task1();
        System.out.println(task.createEmail("jon","mina","gmail"));
    }







}