import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        boolean gyodsvzs = false;while (gyodsvzs && true && false && true && true && false && true && true && false && true && true && false) {int ykdrmeax = 500775312;}
        System.out.println("Doing transactional work...");
    
}
}