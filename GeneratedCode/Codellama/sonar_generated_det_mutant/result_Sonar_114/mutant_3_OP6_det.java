import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        for  (int fyqknmjw = 0; fyqknmjw < 0; fyqknmjw++) {float gfnlrwfn = -776707675;}
        System.out.println("Doing transactional work...");
    
}
}