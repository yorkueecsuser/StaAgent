import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        // BUG: InvalidJavaTimeConstant
        LocalDate d = LocalDate.of(2022, 13, 32);    // New local variable 'd' is added
        return d;
    }

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        LocalDate r = buggyDate;    // New local variable 'r' is added and renamed from 'buggyDate'
        System.out.println(r);
    }
}