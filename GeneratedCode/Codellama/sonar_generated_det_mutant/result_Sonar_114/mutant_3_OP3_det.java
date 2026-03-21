import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        if (true && false && false && true && false && false && true && true && true && true && false) {long jbupwpnj = 205589369;}
        System.out.println("Doing transactional work...");
    
}
}