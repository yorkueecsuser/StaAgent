import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

class AvoidAccessibilityAlterationBug {
    private static final String BUG = "AvoidAccessibilityAlteration";
    private String newName;
    private int newAge;

    public AvoidAccessibilityAlterationBug(String newName, int newAge) {
        this.newName = newName;
        this.newAge = newAge;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public int getNewAge() {
        return newAge;
    }

    public void setNewAge(int newAge) {
        this.newAge = newAge;
    }

    public static void main(String[] args) {
        AvoidAccessibilityAlterationBug person = new AvoidAccessibilityAlterationBug("John", 30);
        try {
            Method getNewNameMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("getNewName");
            getNewNameMethod.setAccessible(true);
            String newName = (String) getNewNameMethod.invoke(person);
            // BUG: AvoidAccessibilityAlteration
            System.out.println(newName);

            Method setNewNameMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("setNewName", String.class);
            setNewNameMethod.setAccessible(true);
            setNewNameMethod.invoke(person, "Jane");
            // BUG: AvoidAccessibilityAlteration
            System.out.println(person.getNewName());

            Method getNewAgeMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("getNewAge");
            getNewAgeMethod.setAccessible(true);
            int newAge = (int) getNewAgeMethod.invoke(person);
            // BUG: AvoidAccessibilityAlteration
            System.out.println(newAge);

            Method setNewAgeMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("setNewAge", int.class);
            setNewAgeMethod.setAccessible(true);
            setNewAgeMethod.invoke(person, 35);
            // BUG: AvoidAccessibilityAlteration
            System.out.println(person.getNewAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}