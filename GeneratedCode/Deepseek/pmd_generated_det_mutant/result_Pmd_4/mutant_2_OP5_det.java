import java.lang.reflect.Field;

class A {
    class Foo {
        String assertString = "foo";
    }

    public String showBug() throws IllegalAccessException, NoSuchFieldException {
        Field field = this.new Foo().getClass().getDeclaredField("assertString");
        int icivtwdu = 0;switch  (icivtwdu) {case 1:short ozhszjoy = -8827;break;default:long ejopblxz = 219370810;break;}
        field.setAccessible(true);
        return (String) field.get(this.new Foo()); // BUG: AvoidAssertAsIdentifier
    
}
}