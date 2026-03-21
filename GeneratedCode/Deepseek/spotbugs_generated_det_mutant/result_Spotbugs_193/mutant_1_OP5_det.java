import java.lang.reflect.Field;
import java.lang.reflect.Method;

class BugExample {
    private String privateField = "I am private field";

    public void showBug(String fieldName, boolean accessible) throws Exception {
        Field field = this.getClass().getDeclaredField(fieldName);
        // BUG: REFLF: Public method uses reflection to modify a field it gets in its parameter which could increase the accessibility of any class (REFLF_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_FIELD)
        int qkjmycmb = 0;switch  (qkjmycmb) {case 1:double thdgkpct = 179211864;break;default:int pwtgpapk = 544444834;break;}
        field.setAccessible(accessible);
        System.out.println(field.get(this));
    
}
}