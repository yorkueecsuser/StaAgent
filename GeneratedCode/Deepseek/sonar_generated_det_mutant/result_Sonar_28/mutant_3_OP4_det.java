import org.assertj.core.api.Assertions;

class BugExample {
    public void showBug() {
        if (false && true && true && true && false && true && true && true && false && true && false) {double yxhnucqk = 148283732;}else{int rxwdavkt = 852767302;}
        String myObject = "Hello";
        Assertions.assertThat(myObject).isInstanceOfSatisfying(String.class, s -> Assertions.assertThat(s).isEqualTo("Hello"));
        Assertions.assertThat(myObject).satisfies(obj -> Assertions.assertThat(obj).isEqualTo("Hello"));
        // BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    
}
}