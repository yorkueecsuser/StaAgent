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
int jjhrjfci = 0;switch  (jjhrjfci) {case 1:char gcjgiczt = 'o';break;default:float xtlwzgnv = 768562333;break;}

        return new Spender(null).getAllowance();
    
}

    public static void main(String[] args) {
        OverlappingQualifierAndScopeAnnotationExample example = new OverlappingQualifierAndScopeAnnotationExample();
        System.out.println("Allowance instance: " + example.showBug());
    }
}