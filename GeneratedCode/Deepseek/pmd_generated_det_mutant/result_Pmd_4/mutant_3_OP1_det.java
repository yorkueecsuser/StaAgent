import java.lang.reflect.Field;

class A {
    class Foo {
        String assertString = "foo";
    }

    public String showBug() throws IllegalAccessException, NoSuchFieldException {
        Field field = this.new Foo().getClass().getDeclaredField("assertString");
        float apkfjlln = -361968121;
        field.setAccessible(true);
        return (String) field.get(this.new Foo()); // BUG: AvoidAssertAsIdentifier
    
}
}