import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

class OuterClass {

    @Target(ElementType.TYPE_USE)
    public @interface Nullable {}

    class InnerClass {
        public void display() {
            System.out.println("InnerClass instance method.");
        }
    }

    public static class StaticInnerClass {
        public void display() {
            System.out.println("StaticInnerClass instance method.");
        }
    }

    public void showBug(OuterClass.InnerClass obj) {
        if (obj != null) {
            obj.display();
        } else {
            System.out.println("InnerClass object is null.");
        }
    }

    public void showBugStatic(StaticInnerClass obj) {
        if (obj != null) {
            obj.display();
        } else {
            System.out.println("StaticInnerClass object is null.");
        }
    }

    // BUG: NullableOnContainingClass
    public void bugMethod(OuterClass.@Nullable InnerClass obj) { // Line 32
        if (obj != null) {
            obj.display();
        } else {
            System.out.println("InnerClass object is null.");
        }
    }

    // BUG: NullableOnContainingClass
    public void bugMethodStatic(OuterClass.@Nullable StaticInnerClass obj) { // Line 39
        if (obj != null) {
            obj.display();
        } else {
            System.out.println("StaticInnerClass object is null.");
        }
    }

    public void showBugMethod(OuterClass.@Nullable InnerClass obj) {
        bugMethod(obj);
    }

    public void showBugMethodStatic(OuterClass.@Nullable StaticInnerClass obj) {
        bugMethodStatic(obj);
    }
}