import com.isa.javabase.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jolka",75, new Adres("Jakies", "Jakaś", 45));
        Person person2 = new Person("Jurek", 45, new Adres("Mazowiecka", "Legiownow", 1));
        Teacher teacher1 = new Teacher("Jolka",75, new Adres("Jakies", "Jakaś",45));
        Teacher teacher2 = new Teacher("Jolka",75, new Adres("Jakies", "Jakaś",45));
        //teacher.work();
        Fireman fireman = new Fireman();
        //fireman.work();
//
//        Person[] osoby = {person, teacher, fireman};
//        for (Person costam: osoby){
//            costam.work();
//            costam.toString();
//        }
        boolean equals1 = person2.equals(person1);
        boolean equals2 = person1.equals(person1);
        boolean equals3 = teacher1.equals(person1);
        boolean equals4 = teacher1.equals(teacher2);
        System.out.println(equals1);
        System.out.println(equals2);
        System.out.println(equals3);
        System.out.println(equals4);
    }
}