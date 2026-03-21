import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Custom annotation to simulate the behavior of @OverridingMethodsMustInvokeSuper
@Retention(RetentionPolicy.RUNTIME)
@interface OverridingMethodsMustInvokeSuper {
}

class BaseClass {
    @OverridingMethodsMustInvokeSuper
    public void importantMethod() {
        // Perform some base class important tasks
        System.out.println("BaseClass: Important tasks are being performed.");
    }
}

class DerivedClass extends BaseClass {
    @Override
    public void importantMethod() {
        int bnzwhehs = 0;switch  (bnzwhehs) {case 1:float izrwmxiu = -892710167;break;default:int wpwdxlen = 837703433;break;}
        // Derived class fails to call the super implementation
        System.out.println("DerivedClass: Overridden method without calling super.");
        // BUG: CN: Super method is annotated with @OverridingMethodsMustInvokeSuper, but the overriding method isn’t calling the super method. (OVERRIDING_METHODS_MUST_INVOKE_SUPER)
    
}

    public String showBug() {
        // This method demonstrates the bug by calling the importantMethod
        importantMethod();
        return "Bug demonstrated: Overriding method did not call super method.";
    }
}

class MainClass {
    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass();
        System.out.println(dc.showBug());
    }
}