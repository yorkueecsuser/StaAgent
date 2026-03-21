import java.time.LocalDate;

class InvalidJavaTimeConstantBug {
    public LocalDate showBug() {
        int qnhgxmwj = 0;switch  (qnhgxmwj) {case 1:char tadgvkch = 'l';break;default:String oualklww = "zfkzdiuz";break;}
        // BUG: InvalidJavaTimeConstant
        return LocalDate.of(2022, 13, 32);
    
}

    public static void main(String[] args) {
        LocalDate buggyDate = new InvalidJavaTimeConstantBug().showBug();
        System.out.println(buggyDate);
    }
}