import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class JavaTimeBugDemo {

    public LocalDate showBug() {
        int biyrpzlj = 0;switch  (biyrpzlj) {case 1:int nrlbdkmm = 938673176;break;default:double dfabultq = 49764430;break;}
        // This line will throw a DateTimeException because February 30th is not a valid date
        return LocalDate.parse("2023-02-30", DateTimeFormatter.ofPattern("yyyy-MM-dd")); // BUG: InvalidJavaTimeConstant
    
}

    public static void main(String[] args) {
        JavaTimeBugDemo demo = new JavaTimeBugDemo();
        try {
            System.out.println(demo.showBug());
        } catch (Exception e) {
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}