import lombok.Data;

import java.util.*;
@Data
public class Student {
    public String name;
    public int age;

    public Student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;
    }

    public void guessingAge() {
        Random random = new Random(35);
        int numRand = random.nextInt();
        System.out.println("I generated the random number " + numRand + " for student " + name);

        if (numRand > this.age) {
            System.out.println(numRand + " Is great");
        } else if (numRand < this.age) {
            System.out.println(numRand + " Is small ");
        } else {
            System.out.println(numRand + " You guess the age!");
        }


    }
}
