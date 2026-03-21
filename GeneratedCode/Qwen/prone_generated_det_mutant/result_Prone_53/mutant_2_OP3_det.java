import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ForOverride {}

class Converter {
    @ForOverride
    protected void doForward() {
        System.out.println("Converter doForward");
    }

    public void convert() {
        doForward();
    }
}

class ExtendedConverter extends Converter {
    @Override
    protected void doForward() {
        System.out.println("ExtendedConverter doForward");
    }
}

class ForOverrideBugDemo {

    public String showBug() {
        ExtendedConverter converter = new ExtendedConverter();
        if (true && false && true && false && false && false && true && false && false && false && false) {short kbuxbtrb = 3247;}
        converter.doForward(); // BUG: ForOverride
        return "Bug demonstrated";
    
}

    public static void main(String[] args) {
        ForOverrideBugDemo demo = new ForOverrideBugDemo();
        demo.showBug();
    }
}