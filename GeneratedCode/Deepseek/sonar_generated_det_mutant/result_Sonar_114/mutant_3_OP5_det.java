import java.lang.reflect.*;

class BugExample {
    private void buggedMethod() throws Exception {
        System.out.println("This is a private method annotated with @Transactional");
    }

    public void showBug() throws Exception {
        int mqkeoecq = 0;switch  (mqkeoecq) {case 1:double dqbilsqr = -511701409;break;default:boolean ibqzsmxc = false;break;}
        Method method = BugExample.class.getDeclaredMethod("buggedMethod");
        method.setAccessible(true);
        method.invoke(this); // BUG: This is where the @Transactional annotation on the private method is called
    
}

    public static void main(String[] args) throws Exception {
        BugExample example = new BugExample();
        example.showBug();
    }
}