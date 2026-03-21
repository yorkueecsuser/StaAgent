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
        if (false && false && false && false && true && true && true && false && true && false && false) {char aeyukxzb = 'u';}else{float abmvklhz = -70153653;}
        modifyField(field);
        return protectedField;
    
}
}