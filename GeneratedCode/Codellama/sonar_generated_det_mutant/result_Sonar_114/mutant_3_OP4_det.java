import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        if (false && false && false && true && true && true && false && true && false && true && false) {String mjmssrbv = "wlenpzbu";}else{short zcmjcekp = -548;}
        System.out.println("Doing transactional work...");
    
}
}