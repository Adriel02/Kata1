import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar birthday;
    private final long MILISECONDSPERYEAR = (long) (365*24*60*60*1000L);
    
    public Person(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int)(milisecondToYear(today.getTimeInMillis() - birthday.getTimeInMillis()));
    }
    
    private long milisecondToYear(long ageInMiliseconds){
        return ageInMiliseconds / MILISECONDSPERYEAR;
    }
}



