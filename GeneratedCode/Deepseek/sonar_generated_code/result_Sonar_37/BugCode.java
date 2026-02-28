import java.lang.reflect.Method;

class BugCode {
    @RepeatedTest(2)
    public void test() {
        System.out.println("Test passed");
    }

    @ParameterizedTest
    public void test2(int argument) {
        System.out.println("Test2 passed with argument " + argument);
    }

    public void showBug() {
        try {
            Method method = BugCode.class.getMethod("test");
            method.invoke(new BugCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showBug2() {
        try {
            Method method = BugCode.class.getMethod("test2", int.class);
            method.invoke(new BugCode(), 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}