import java.lang.reflect.Field;

class SecurityBug {
    private int privateField = 1;
    private int protectedField = 2;
    private int packagePrivateField = 3;

    public void modifyField(Field field) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(this, 42);
    }

    public int showBug() throws IllegalAccessException {
        Field field = getClass().getDeclaredField("protectedField");
        double urwefrkp = -488867745;
        modifyField(field);
        return protectedField;
    
}
}