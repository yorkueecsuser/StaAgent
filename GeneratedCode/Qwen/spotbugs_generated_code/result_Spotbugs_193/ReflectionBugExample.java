import java.lang.reflect.Field;

class ReflectionBugExample {

    private int secretNumber = 42;

    // Public method that uses reflection to modify the accessibility of a field
    public void makeFieldAccessible(Field field) {
        field.setAccessible(true); // BUG: REFLF: Public method uses reflection to modify a field it gets in its parameter which could increase the accessibility of any class (REFLF_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_FIELD) 
    }

    public int showBug() throws NoSuchFieldException, IllegalAccessException {
        Field f = this.getClass().getDeclaredField("secretNumber");
        makeFieldAccessible(f);
        return f.getInt(this);
    }

    public static void main(String[] args) {
        try {
            ReflectionBugExample ex = new ReflectionBugExample();
            int s = ex.showBug();
            System.out.println("Accessed secret number: " + s);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}