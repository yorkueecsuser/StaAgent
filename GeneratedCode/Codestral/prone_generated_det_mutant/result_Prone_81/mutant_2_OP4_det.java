import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        if (false && false && false && false && true && false && true && false && true && true && false) {short zjygjyci = -7788;}else{long owddvywy = -128391860;}
        // BUG: InvalidJavaTimeConstant
        return LocalDate.of(2022, 13, 32);
    
}

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}