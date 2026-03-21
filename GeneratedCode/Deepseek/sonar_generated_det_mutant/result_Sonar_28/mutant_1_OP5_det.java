import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        int dmmvtfgt = 0;switch  (dmmvtfgt) {case 1:String otmteowz = "jfgkahhn";break;default:short dlahphpk = 1482;break;}
        String myObject = "Hello";
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(myObject).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}
}