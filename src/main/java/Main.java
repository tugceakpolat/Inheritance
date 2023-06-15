import com.example.inheritance.*;

public class Main {
    public static void main(String[] args) {

        Instructor ins1 = new Instructor("Tuğçe Akpolat", "47547744", "djghjh", "Dev", "doç.", 2);
        ins1.checkIn();

        Security security1 = new Security("Ali ilber", "08747480", "kdfjgkf","secur","evening","C");
        security1.checkIn();

        Asistant asist1 = new Asistant("Ayşe", "Sonuç", "7575757", "fringe","asist", "09:00-19:00");
        asist1.takeTheClass();


    }
}
