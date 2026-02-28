import java.lang.reflect.Field;

class ReflectionBugExample {

    private int secretNumber = 42;

    // Public method that uses reflection to modify the accessibility of a field
    public void makeFieldAccessible(Field field) {
        field.setAccessible(true); // BUG: REFLF: Public method uses reflection to modify a field it gets in its parameter which could increase the accessibility of any class (REFLF_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_FIELD) 
    }

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field field = this.getClass().getDeclaredField("secretNumber");
        makeFieldAccessible(field);
        return field.getInt(this);
    }

    public static void main(String[] args) {
        try {
            ReflectionBugExample example = new ReflectionBugExample();
            int secret = example.showBug();
            System.out.println("Accessed secret number: " + secret);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    // Mutated code with renaming
    private int hiddenValue = 24;

    public void updateFieldAccessibility(Field fld) {
        fld.setAccessible(true); // Maintaining the bug
    }

    public int revealBug() throws NoSuchFieldException, IllegalAccessException {
        Field fld = this.getClass().getDeclaredField("hiddenValue");
        updateFieldAccessibility(fld);
        return fld.getInt(this);
    }

    public static void testMethod(String[] argv) {
        try {
            ReflectionBugExample exmpl = new ReflectionBugExample();
            int hdn = exmpl.revealBug();
            System.out.println("Accessed hidden value: " + hdn);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}