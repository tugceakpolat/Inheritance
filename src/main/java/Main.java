import com.example.inheritance.Academician;
import com.example.inheritance.Instructor;
import com.example.inheritance.Security;
import com.example.inheritance.Worker;

public class Main {
    public static void main(String[] args) {

        Instructor ins1 = new Instructor("Tuğçe Akpolat", "47547744", "djghjh", "Dev", "doç.", 2);
        ins1.checkIn();

        Academician worker1 = new Academician("Nevzat Akpolat", "0896796", "lkfgmkfg", "design", "prof");
        worker1.checkIn();

        Security security1 = new Security("Ali ilber", "08747480", "kdfjgkf","secur","evening","C");
        security1.checkIn();

        Worker[] loginWorker = {ins1, worker1, security1};

        Worker.entrants(loginWorker);
    }
}
