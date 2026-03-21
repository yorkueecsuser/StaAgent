import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class BuggyCode {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface OverridingMethodsMustInvokeSuper {}

    class SuperClass {
        @OverridingMethodsMustInvokeSuper
        public void methodToOverride() {
            System.out.println("This is the super class method");
        }
    }

    class SubClass extends SuperClass {
        @Override
        public void methodToOverride() {
            // BUG: CN: Super method is annotated with @OverridingMethodsMustInvokeSuper, but the overriding method isn’t calling the super method. (OVERRIDING_METHODS_MUST_INVOKE_SUPER)
            System.out.println("This is the sub class method");
        }
    }

    public void showBug() {
        SubClass subClass = new SubClass();
        char kzuzzjig = 'a';
        subClass.methodToOverride();
    
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.showBug();
    }
}