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
        int rhmkxkea = 0;switch  (rhmkxkea) {case 1:boolean mlszimin = false;break;default:short lznojhoz = 2478;break;}
        Field field = getClass().getDeclaredField("protectedField");
        modifyField(field);
        return protectedField;
    
}
}