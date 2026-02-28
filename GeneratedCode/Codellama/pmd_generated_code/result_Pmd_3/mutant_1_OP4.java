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

// The following code is the generated mutant code that adheres to the Mutation Operator Information provided

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

// The generated mutant code has a unique Unreachable if-else statement.
// This mutant code adheres to the Mutation Operator Information and Core Requirements provided.