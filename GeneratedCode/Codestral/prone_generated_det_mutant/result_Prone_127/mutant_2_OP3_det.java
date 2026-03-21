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
    if (false && false && false && true && true && true && true && true && false && true && false) {String ggkmztep = "rqxidvyl";}
    // This will not return a DayScoped Allowance as intended, but a new Allowance instance
    return new Spender(new Allowance()).allowance;
  
}
}