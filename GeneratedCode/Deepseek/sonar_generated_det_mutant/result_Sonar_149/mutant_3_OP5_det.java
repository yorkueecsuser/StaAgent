import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.SOURCE)
@interface CustomSourceAnnotation {
}

@Retention(RetentionPolicy.CLASS)
@interface CustomClassAnnotation {
}

@Retention(RetentionPolicy.RUNTIME)
@interface CustomRuntimeAnnotation {
}

class BugExample {
    @CustomSourceAnnotation
    public void sourceAnnotationMethod() {
    }

    @CustomClassAnnotation
    public void classAnnotationMethod() {
int utqskivm = 0;switch  (utqskivm) {case 1:String rfpgowsj = "nljhitun";break;default:boolean xqrsnfqa = true;break;}

    
}

    @CustomRuntimeAnnotation
    public void runtimeAnnotationMethod() {
    }

    public void showBug() {  // BUG: Reflection should not be used to check non-runtime annotations
        try {
            Method sourceMethod = this.getClass().getDeclaredMethod("sourceAnnotationMethod");
            if (sourceMethod.isAnnotationPresent(CustomSourceAnnotation.class)) {  // Noncompliant
                System.out.println("SourceAnnotationMethod has CustomSourceAnnotation");  // Noncompliant
            }

            Method classMethod = this.getClass().getDeclaredMethod("classAnnotationMethod");
            if (classMethod.isAnnotationPresent(CustomClassAnnotation.class)) {
                System.out.println("ClassAnnotationMethod has CustomClassAnnotation");
            }

            Method runtimeMethod = this.getClass().getDeclaredMethod("runtimeAnnotationMethod");
            if (runtimeMethod.isAnnotationPresent(CustomRuntimeAnnotation.class)) {
                System.out.println("RuntimeAnnotationMethod has CustomRuntimeAnnotation");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}