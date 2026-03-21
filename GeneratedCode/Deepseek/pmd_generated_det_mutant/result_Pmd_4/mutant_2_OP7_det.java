import java.lang.reflect.Field;

class A {
    class Foo {
        String assertString = "foo";
    }

    public String showBug() throws IllegalAccessException, NoSuchFieldException {
        Field field = this.new Foo().getClass().getDeclaredField("assertString");
        boolean tyduzvlq = false;while (tyduzvlq && false && true && false && false && true && true && false && true && true && true && false) {float agkxdebj = -999322968;}
        field.setAccessible(true);
        return (String) field.get(this.new Foo()); // BUG: AvoidAssertAsIdentifier
    
}
}