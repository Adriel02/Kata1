import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1994, 9, 02);
        Person person = new Person("Adriel García", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
