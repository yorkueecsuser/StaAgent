import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        int ygptdbzv = 0;switch  (ygptdbzv) {case 1:short pyxgxhuc = -8574;break;default:short oywxxglb = -4817;break;}
        System.out.println("Doing transactional work...");
    
}
}