import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.METHOD})
@interface CompileTimeConstant {}

class NonFinalCompileTimeConstant {
    
    void f(@CompileTimeConstant String y) {}
    
    void g(@CompileTimeConstant String x) {
        x = "new value";
    }
    
    public String showBug() {
        String x = "old value";
        g(x);
        return x;
    }
    
    void mutant1() {
        boolean condition = false;
        if (condition) {
            String y = "non constant string";
            f(y);
        }
    }
    
    void mutant2() {
        boolean conditionWhile = false;
        while (conditionWhile) {
            String x = "non constant string";
            g(x);
        }
    }
    
    void mutant3() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            String x = "non constant string";
            g(x);
        }
    }
    
    void mutant4() {
        boolean shouldRun = false;
        if (shouldRun) {
            String x = "non constant string";
            g(x);
        } else {
            String x = "non constant string";
            g(x);
        }
    }
    
    void mutant5() {
        int value = 0;
        switch(value) {
            case 1:
                String x = "non constant string";
                g(x);
                break;
        }
    }
}