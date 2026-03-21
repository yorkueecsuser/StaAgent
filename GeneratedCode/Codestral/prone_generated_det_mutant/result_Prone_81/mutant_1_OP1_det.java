import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        char dshghppy = 'a';
        // BUG: InvalidJavaTimeConstant
        return LocalDate.of(2022, 13, 32);
    
}

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}