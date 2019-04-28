package Scrum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Deloy to Azure", "Bob", 6, "In progress");
        Task task2 = new Task("Handle user input", "John", 5, "In progress");
        Task task3 = new Task("Connect DB", "John", 3, "To do");
        Task task4 = new Task("Add users", "Jessica", 2, "To do");
        Task task5 = new Task("Configure logging", "John", 1, "To do");
        Task task6 = new Task("Prepare dataset", "Bob", 5, "Done");

        List<Task> list1 = new ArrayList<>();

        list1.add(task1);
        list1.add(task2);
        list1.add(task3);
        list1.add(task4);
        list1.add(task5);
        list1.add(task6);



        for (Task t : list1){

            if (t.getStatus().equals("In progress")){
                System.out.println(t.getSubject() + " " + "(" + t.getUser() +", " + t.getTime() + ")");
            }

            else if(t.getStatus().equals("To do")){
                System.out.println(t.getSubject() + " " + "(" + t.getUser() +", " + t.getTime() + ")");
            }
            else{
                System.out.println(t.getSubject() + " " + "(" + t.getUser() +", " + t.getTime() + ")");
            }
        }

        quantityOfTasks(list1, "John");
    }

    public static void approximateTime(List<Task> list){

        double a = 0;

        for (Task t : list){
            a = a + t.getTime();
        }
        System.out.println("Mean approximate time per task is " + a/list.size());
    }

    public static int sum1(List<Task> list){

        int a = 0;

        for (Task t : list){
            if (t.getSubject().equals("In progress")){
                a++;
            }
        }
        return a;
    }

    public static int sum2(List<Task> list){

        int b = 0;

        for (Task t : list){
            if (t.getSubject().equals("To do")){
                b++;
            }
        }
        return b;
    }

    public static int sum3(List<Task> list){

        int c = 0;

        for (Task t : list){
            if (t.getSubject().equals("Done")){
                c++;
            }
        }
        return c;
    }

    public static void quantityOfTasks(List<Task> list, String name){
        int x = 0;

        for (Task t : list){
            if (t.getUser().equals(name)){
                x++;
            }
        }
        System.out.println(name + " was assigned to " + x + " tasks in this sprint.");
    }
}
