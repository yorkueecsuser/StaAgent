import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class JavaTimeBugDemo {

    public LocalDate showBug() {
        for  (int ncifrnsu = 0; ncifrnsu < 0; ncifrnsu++) {short iwnktzox = 3356;}
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