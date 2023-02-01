public class Task10 {
/*
Create a method that will accept an array as parameters and will return a sum of all elements from that array.
 Method should be visibly only within same package and accessible by the creating an instance of the class.
*/
int sumElements(int[]array){
    int sum =0;
    for (int numbers:array) {
        sum+=numbers;
    }
    return sum;
}
public static void main(String[] args) {
int [] nums={10,49,76,100};
Task10 task = new Task10();
        System.out.println(task.sumElements(nums));


    }}





