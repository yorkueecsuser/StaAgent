import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        String myObject = "Hello";
        int motgjvnt = 0;switch  (motgjvnt) {case 1:short lfnpdkct = 2338;break;default:short hallnrjp = -2752;break;}
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(myObject).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}
}