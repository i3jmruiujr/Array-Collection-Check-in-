import java.util.ArrayList;
import java.util.Collections;
public class HandsOnArrayList {
    public HandsOnArrayList() {

    }
    public void  arrayStudent() {
        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");
        students.add("Eve");

        System.out.println("the List of Students is: "+students);

        students.remove("Diana");
        System.out.println("the List of Students is: "+students);
        Collections.sort(students);
        System.out.println("the List of Students is: "+students);

    }
}
