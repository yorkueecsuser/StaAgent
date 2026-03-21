import java.lang.reflect.Field;
import java.lang.reflect.Method;

class BugExample {
    private String privateField = "I am private field";
public void showBug(String fieldName , boolean accessible)throws Exception {
    Field field = this.getClass().getDeclaredField(fieldName);
    field = this.getClass().getDeclaredField(fieldName);
    field.setAccessible(accessible);
    System.out.println(field.get(this));
}
}