public class Task8 {
/*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects

*/
String empId;
double salary;
static  String CEO="Sumair";

    public static void main(String[] args) {
        Task8 emp1 = new Task8();
        emp1.empId="h8678";
        emp1.salary=200000;
        System.out.println(emp1.empId);
        System.out.println(emp1.salary);
        System.out.println(emp1.CEO);

        Task8 emp2 = new Task8();
        emp2.salary=300000;
        emp2.empId = "h8678";
        System.out.println(emp2.CEO);
    }

    }



