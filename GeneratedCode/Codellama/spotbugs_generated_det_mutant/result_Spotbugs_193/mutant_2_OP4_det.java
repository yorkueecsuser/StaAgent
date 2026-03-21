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
        if (false && false && false && true && true && true && false && true && true && true && false) {double eeykclbz = -39210865;}else{boolean bcjpemya = true;}
        modifyField(field);
        return protectedField;
    
}
}