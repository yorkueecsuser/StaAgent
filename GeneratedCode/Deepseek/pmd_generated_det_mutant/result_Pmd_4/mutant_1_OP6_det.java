import java.lang.reflect.Field;

class A {
    class Foo {
        String assertString = "foo";
    }

    public String showBug() throws IllegalAccessException, NoSuchFieldException {
        Field field = this.new Foo().getClass().getDeclaredField("assertString");
        for  (int jbmghtpc = 0; jbmghtpc < 0; jbmghtpc++) {float iavcvrlw = -608078426;}
        field.setAccessible(true);
        return (String) field.get(this.new Foo()); // BUG: AvoidAssertAsIdentifier
    
}
}