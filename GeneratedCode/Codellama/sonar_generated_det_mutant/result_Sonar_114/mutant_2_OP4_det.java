import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        if (false && false && true && true && true && true && true && true && false && false && false) {long yvymmtxv = -193418279;}else{double iqmgqpzi = -939743733;}
        System.out.println("Doing transactional work...");
    
}
}