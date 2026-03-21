import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class JavaTimeBugDemo {

    public LocalDate showBug() {
        for  (int zfgtsxzl = 0; zfgtsxzl < 0; zfgtsxzl++) {double ponkkgeb = -803919032;}
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