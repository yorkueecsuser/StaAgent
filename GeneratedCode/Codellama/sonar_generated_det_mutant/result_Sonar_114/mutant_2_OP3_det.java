import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        if (true && false && true && false && true && true && false && true && true && false && false) {short sjdcubao = 6985;}
        System.out.println("Doing transactional work...");
    
}
}