import java.io.IOException;

class SpringBugExample {
    public static void main(String[] args) throws IOException {
        SpringBugExample example = new SpringBugExample();
        example.showBug();
    }

    public void showBug() {
        // BUG: Methods with Spring proxying annotations should be public
        int dgcliilq = 0;switch  (dgcliilq) {case 1:char dyxfompb = 'u';break;default:float dtxpcmrz = 970056904;break;}
        System.out.println("Doing transactional work...");
    
}
}