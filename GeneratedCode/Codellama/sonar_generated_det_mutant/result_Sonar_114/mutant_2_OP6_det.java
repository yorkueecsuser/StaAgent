import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        for  (int xrzcqhdh = 0; xrzcqhdh < 0; xrzcqhdh++) {long rnthmsvd = 613080985;}
        System.out.println("Doing transactional work...");
    
}
}