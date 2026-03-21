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
        boolean pxlbpksb = false;while (pxlbpksb && true && false && false && true && true && true && false && false && false && true && false) {double ryfjvwub = 746417510;}
        modifyField(field);
        return protectedField;
    
}
}