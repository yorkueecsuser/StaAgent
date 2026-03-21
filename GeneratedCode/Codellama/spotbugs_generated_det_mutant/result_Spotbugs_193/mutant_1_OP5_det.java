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
        int wpjfcsgg = 0;switch  (wpjfcsgg) {case 1:double bzisfcge = 661398949;break;default:long pwvbghnu = 178836936;break;}
        Field field = getClass().getDeclaredField("protectedField");
        modifyField(field);
        return protectedField;
    
}
}