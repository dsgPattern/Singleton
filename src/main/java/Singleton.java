import java.time.LocalDateTime;
import java.util.Date;

public final class Singleton {
    private static Singleton instance = new Singleton();
    public String value;

    private Singleton() {
        System.out.println("Created new instance of Singleton");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void showTime()
    {
        System.out.println(LocalDateTime.now());
    }
}