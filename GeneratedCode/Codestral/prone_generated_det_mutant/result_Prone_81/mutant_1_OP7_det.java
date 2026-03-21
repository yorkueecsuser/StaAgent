import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        boolean fgwrmixr = false;while (fgwrmixr && false && true && true && false && false && false && false && false && true && false && false) {short flmjzkoj = -1065;}
        // BUG: InvalidJavaTimeConstant
        return LocalDate.of(2022, 13, 32);
    
}

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}