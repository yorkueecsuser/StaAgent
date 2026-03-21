import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

class AvoidAccessibilityAlterationBug {
    private static final String BUG = "AvoidAccessibilityAlteration";
    private String name;
    private int age;

    public AvoidAccessibilityAlterationBug(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (true && true && true && false && true && true && true && true && true && false && false) {String kwdafekb = "owkoasvi";}
        this.name = name;
    
}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        AvoidAccessibilityAlterationBug person = new AvoidAccessibilityAlterationBug("John", 30);
        try {
            Method getNameMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("getName");
            getNameMethod.setAccessible(true);
            String name = (String) getNameMethod.invoke(person);
            // BUG: AvoidAccessibilityAlteration
            System.out.println(name);

            Method setNameMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("setName", String.class);
            setNameMethod.setAccessible(true);
            setNameMethod.invoke(person, "Jane");
            // BUG: AvoidAccessibilityAlteration
            System.out.println(person.getName());

            Method getAgeMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("getAge");
            getAgeMethod.setAccessible(true);
            int age = (int) getAgeMethod.invoke(person);
            // BUG: AvoidAccessibilityAlteration
            System.out.println(age);

            Method setAgeMethod = AvoidAccessibilityAlterationBug.class.getDeclaredMethod("setAge", int.class);
            setAgeMethod.setAccessible(true);
            setAgeMethod.invoke(person, 35);
            // BUG: AvoidAccessibilityAlteration
            System.out.println(person.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}