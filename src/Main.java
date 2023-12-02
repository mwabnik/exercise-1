import com.isa.javabase.Adres;
import com.isa.javabase.Person;
import com.isa.javabase.SimpleDataType;
import com.isa.javabase.StaticExamples;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print("Text 1");
        System.out.println("Text 2");


        Adres adres1 = new Adres("Warszawa", "Mazowiecka",12);
        System.out.println("Miasto: " + adres1.getCity() + ", ulica: " + adres1.getStreet() + " " + adres1.getNumber());
        Person person1 = new Person("Michal", 38, adres1);
        System.out.println(person1.getNameAndAgeAndCity() + ", ulica: " + person1.getAdres().getCity() + " " + person1.getAdres().getNumber());

        StaticExamples static1 = new StaticExamples();
        System.out.println(StaticExamples.staticMethod());
        static1.instanceMethod();

        SimpleDataType simpleDataType = new SimpleDataType();
        simpleDataType.test(1, 2.425);
        simpleDataType.getStringLength("Warszawa");
        simpleDataType.getIsEmpty("Warszawa");
        simpleDataType.getIsEmpty("");
        simpleDataType.getUpperCase("Warszawa");


    }
}