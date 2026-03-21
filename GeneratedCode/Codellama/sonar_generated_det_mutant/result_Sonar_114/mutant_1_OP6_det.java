import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        for  (int btyclags = 0; btyclags < 0; btyclags++) {long vbxrpmfi = -274646111;}
        System.out.println("Doing transactional work...");
    
}
}