import java.text.SimpleDateFormat;
import java.util.Date;

class MisusedWeekYear {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(date)); // BUG: MisusedWeekYear

        // Unreachable switch statement
        int randomNumber = (int) Math.random() * 2 + 1;
        switch (randomNumber) {
            case 1:
                System.out.println("Hello, World!");
                break;
            case 2:
                System.out.println("Goodbye, World!");
                break;
            default:
                System.out.println("Unreachable code");
                break;
        }
    }
}