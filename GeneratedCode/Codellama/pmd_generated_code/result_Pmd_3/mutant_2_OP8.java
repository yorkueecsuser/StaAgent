import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

class AvoidAccessibilityAlterationBug {
    private static final String BUG = "AvoidAccessibilityAlteration";
    private String a;
    private int b;

    public AvoidAccessibilityAlterationBug(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        AvoidAccessibilityAlterationBug person = new AvoidAccessibilityAlterationBug("John", 30);
        try {
            Method getAMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("getA");
            getAMethod.setAccessible(true);
            String a = (String) getAMethod.invoke(person);
            // BUG: AvoidAccessibilityAlteration
            System.out.println(a);

            Method setAMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("setA", String.class);
            setAMethod.setAccessible(true);
            setAMethod.invoke(person, "Jane");
            // BUG: AvoidAccessibilityAlteration
            System.out.println(person.getA());

            Method getBMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("getB");
            getBMethod.setAccessible(true);
            int b = (int) getBMethod.invoke(person);
            // BUG: AvoidAccessibilityAlteration
            System.out.println(b);

            Method setBMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("setB", int.class);
            setBMethod.setAccessible(true);
            setBMethod.invoke(person, 35);
            // BUG: AvoidAccessibilityAlteration
            System.out.println(person.getB());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}