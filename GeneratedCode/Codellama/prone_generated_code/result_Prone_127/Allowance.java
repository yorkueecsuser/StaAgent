import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.inject.Scope;

@Retention(RetentionPolicy.RUNTIME)
@Scope
@Qualifier
@interface DayScoped {}

static class Allowance {}
static class DailyAllowance extends Allowance {}
static class Spender {
  @Inject
  Spender(Allowance allowance) {}
}

static class BindingModule extends AbstractModule {
 ...
  @Provides
  @DayScoped
  Allowance providesAllowance() {
    return new DailyAllowance();
  }
}

public void showBug() {
  // BUG: OverlappingQualifierAndScopeAnnotation
  // The generated code shows the bug where an annotation is both a Scope and a Qualifier,
  // causing confusion when trying to use it.
  Spender spender = new Spender(new DailyAllowance());
  System.out.println(spender.toString());
}