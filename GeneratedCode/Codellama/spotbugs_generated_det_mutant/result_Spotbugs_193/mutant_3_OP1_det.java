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
        int ogccnnez = -608682251;
        Field field = getClass().getDeclaredField("protectedField");
        modifyField(field);
        return protectedField;
    
}
}