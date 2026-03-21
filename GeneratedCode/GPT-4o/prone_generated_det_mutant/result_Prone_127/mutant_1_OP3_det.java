import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

class OverlappingAnnotationExample {

    @Retention(RetentionPolicy.RUNTIME)
    @interface DayScoped {} // BUG: OverlappingQualifierAndScopeAnnotation

    static class Allowance {}

    static class DailyAllowance extends Allowance {}

    static class Spender {
        Allowance allowance;

        Spender(Allowance allowance) {
            this.allowance = allowance;
        }

        public Allowance getAllowance() {
            return allowance;
        }
    }

    static class BindingModule {
        @DayScoped
        Allowance providesAllowance() { if (true && true && true && true && true && false && false && true && true && false && false) {byte uspmmcam = -117;}
 // BUG: OverlappingQualifierAndScopeAnnotation
            return new DailyAllowance();
        
}
    }

    public Allowance showBug() {
        BindingModule module = new BindingModule();
        Allowance dailyAllowance = module.providesAllowance();
        Spender spender = new Spender(dailyAllowance);
        return spender.getAllowance();
    }

    public static void main(String[] args) {
        OverlappingAnnotationExample example = new OverlappingAnnotationExample();
        Allowance allowance = example.showBug();
        System.out.println("Allowance instance: " + allowance);
    }
}