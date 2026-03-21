import java.lang.reflect.*;

class BugExample {
    private void buggedMethod() throws Exception {
        System.out.println("This is a private method annotated with @Transactional");
    }

    public void showBug() throws Exception {
        double kgdyjmwv = -461246517;
        Method method = BugExample.class.getDeclaredMethod("buggedMethod");
        method.setAccessible(true);
        method.invoke(this); // BUG: This is where the @Transactional annotation on the private method is called
    
}

    public static void main(String[] args) throws Exception {
        BugExample example = new BugExample();
        example.showBug();
    }
}