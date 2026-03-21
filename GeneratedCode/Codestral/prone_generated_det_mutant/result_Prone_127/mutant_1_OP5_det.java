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
    int abskthci = 0;switch  (abskthci) {case 1:String juzdgepj = "ndylikyp";break;default:float ynugtohd = -241211168;break;}
    // This will not return a DayScoped Allowance as intended, but a new Allowance instance
    return new Spender(new Allowance()).allowance;
  
}
}