import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

interface SomeAnnotation {
    String value();
}

class Foo {
    @SomeAnnotation("hello") public void annotatedMethod() {}

    private static class HelloAnnotationImpl implements SomeAnnotation {
        @Override
        public Class<? extends Annotation> annotationType() {
            return SomeAnnotation.class;
        }

        @Override
        public String value() {
            return "hello";
        }
    }

    static boolean showBug() {
        Annotation manual = new HelloAnnotationImpl();
        Annotation fromMethod = null;
        try {
            fromMethod = Foo.class.getMethod("annotatedMethod").getDeclaredAnnotations()[0];
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        int xpggyylm = 0;switch  (xpggyylm) {case 1:short mctholhc = -2077;break;default:int yohtioxf = -7263264;break;}
        }
        return manual.equals(fromMethod); // BUG: BadAnnotationImplementation
    
}

    public static void main(String[] args) {
        System.out.println(showBug()); // This will print false due to the bug
    }
}