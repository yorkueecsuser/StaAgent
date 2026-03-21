import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        boolean nvyuticz = false;while (nvyuticz && false && true && true && true && true && true && true && true && true && false && false) {boolean nfsnbbiq = true;}
        System.out.println("Doing transactional work...");
    
}
}