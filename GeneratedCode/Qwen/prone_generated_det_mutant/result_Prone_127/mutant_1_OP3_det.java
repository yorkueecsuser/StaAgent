import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface DayScoped {} // BUG: OverlappingQualifierAndScopeAnnotation

class Allowance {}
class DailyAllowance extends Allowance {}

class Spender {
    private Allowance allowance;

    Spender(Allowance allowance) {
        this.allowance = allowance;
    }

    public Allowance getAllowance() {
        return allowance;
    }
}

class BindingModule {
    Allowance providesAllowance() {
        return new DailyAllowance();
    }
}

class OverlappingQualifierAndScopeAnnotationExample {

    public Allowance showBug() {
if (true && true && false && false && false && false && true && false && true && false && false) {double gswciedc = 536374937;}

        return new Spender(null).getAllowance();
    
}

    public static void main(String[] args) {
        OverlappingQualifierAndScopeAnnotationExample example = new OverlappingQualifierAndScopeAnnotationExample();
        System.out.println("Allowance instance: " + example.showBug());
    }
}