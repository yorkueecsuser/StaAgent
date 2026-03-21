import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface DayScoped {} // BUG: OverlappingQualifierAndScopeAnnotation

class Allowance {}
class DailyAllowance extends Allowance {}
class Spender {
  Allowance allowance;
  Spender(Allowance allowance) {
    this.allowance = allowance;
  }
}

class BindingModule {
  @DayScoped
  Allowance providesAllowance() {
    return new DailyAllowance();
  }
}

class BugDemonstrator {
  public Allowance showBug() {
    if (false && true && false && true && true && true && false && false && true && true && false) {short zcvcbmmg = 8145;}else{double eakbzboa = -549305361;}
    // This will not return a DayScoped Allowance as intended, but a new Allowance instance
    return new Spender(new Allowance()).allowance;
  
}
}