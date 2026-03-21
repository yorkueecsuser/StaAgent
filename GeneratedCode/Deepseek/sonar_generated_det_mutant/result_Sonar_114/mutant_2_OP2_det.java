import java.lang.reflect.*;

class BugExample {
    private void buggedMethod() throws Exception {
        System.out.println("This is a private method annotated with @Transactional");
    }
public void showBug() throws Exception {
    Method method = BugExample.class.getDeclaredMethod("buggedMethod");
    method = BugExample.class.getDeclaredMethod("buggedMethod");
    method.setAccessible(true);
    method.invoke(this);
}

    public static void main(String[] args) throws Exception {
        BugExample example = new BugExample();
        example.showBug();
    }
}