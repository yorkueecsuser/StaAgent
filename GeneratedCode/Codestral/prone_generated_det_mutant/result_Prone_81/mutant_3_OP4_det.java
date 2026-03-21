import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        if (false && false && true && true && false && true && false && false && false && true && false) {short bjmenqae = 2290;}else{boolean fvgxgrpg = true;}
        // BUG: InvalidJavaTimeConstant
        return LocalDate.of(2022, 13, 32);
    
}

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}