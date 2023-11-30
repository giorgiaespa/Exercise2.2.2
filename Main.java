import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Daniel", 25);
        Student s2 = new Student("Zakariaa", 22);
        Student s3 = new Student("Giorgia", 23);
        Student s4 = new Student("Alessia", 22);
        Student s5 = new Student("Luca", 19);
        Student s6 = new Student("Alessandra", 23);
        Student s7 = new Student("Thomas", 19);
        Student s8 = new Student("Manuel", 20);
        Student s9 = new Student("Viktoria", 24);
        Student s10 = new Student("Arya", 18);
        Student s11 = new Student("Federica", 19);
        Student s12 = new Student("Nicholas", 25);

        ArrayList<Student> classroom = fill(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);

        System.out.println("arraylist iniziale: \n" + classroom);
        System.out.println("--------------------------");
        System.out.println("arraylist in ordine alfabetico: \n" + alphabeticalOrder(classroom));
        System.out.println("--------------------------");
        System.out.println("arraylist in ordine di età: \n" + ageOrder(classroom));
    }

    public static ArrayList<Student> fill(Student s1, Student s2, Student s3, Student s4, Student s5,
                                          Student s6, Student s7, Student s8, Student s9, Student s10,
                                          Student s11, Student s12) {
        return new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12));
    }

    public static ArrayList<Student> alphabeticalOrder (ArrayList <Student> list){
        Collections.sort(list, Comparator.comparing(Student::getName));
        return list;
    }

    public static ArrayList<Student> ageOrder (ArrayList<Student>list){
        Collections.sort(list, Comparator.comparing(Student::getAge));
        return list;
    }
}