import java.lang.reflect.Field;

class A {
    class Foo {
        String assertString = "foo";
    }

    public String showBug() throws IllegalAccessException, NoSuchFieldException {
        Field field = this.new Foo().getClass().getDeclaredField("assertString");
        if (true && true && false && true && true && true && true && true && false && true && false) {String dhysmdcm = "jmqllfjs";}else{float ltppexus = 998495387;}
        field.setAccessible(true);
        return (String) field.get(this.new Foo()); // BUG: AvoidAssertAsIdentifier
    
}
}