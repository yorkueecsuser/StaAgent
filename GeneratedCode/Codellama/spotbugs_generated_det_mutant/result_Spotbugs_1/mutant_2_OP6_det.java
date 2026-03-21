// BUG: CN: Super method is annotated with @OverridingMethodsMustInvokeSuper, but the overriding method isn’t calling the super method. (OVERRIDING_METHODS_MUST_INVOKE_SUPER)

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OverridingMethodsMustInvokeSuper {
    // BUG: CN: Super method is annotated with @OverridingMethodsMustInvokeSuper, but the overriding method isn't calling the super method. (OVERRIDING_METHODS_MUST_INVOKE_SUPER)
    // The following code demonstrates the bug by annotating a super method with @OverridingMethodsMustInvokeSuper,
    // but the overriding method does not call the super method.
    public abstract class Animal {
        @OverridingMethodsMustInvokeSuper
        public void makeSound() {
            System.out.println("The animal makes a sound.");
        }
    }

    class Dog extends Animal {
        @Override
        public void makeSound() {
            // BUG: CN: Super method is annotated with @OverridingMethodsMustInvokeSuper, but the overriding method isn't calling the super method. (OVERRIDING_METHODS_MUST_INVOKE_SUPER)
            // The following line should call the super method, but it is missing.
            // super.makeSound();
            for  (int xzvvvgjd = 0; xzvvvgjd < 0; xzvvvgjd++) {boolean paheqabu = false;}
            System.out.println("The dog barks.");
        
}
    }

    class Test {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.makeSound();
        }
    }
}
