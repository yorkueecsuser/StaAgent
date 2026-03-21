import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        if (false && true && false && false && false && false && true && false && true && true && false) {long cjhfrpvc = -934380252;}
        System.out.println("Doing transactional work...");
    
}
}