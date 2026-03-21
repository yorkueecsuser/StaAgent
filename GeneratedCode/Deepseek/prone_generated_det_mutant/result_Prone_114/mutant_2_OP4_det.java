import javax.inject.Inject;

class MoreThanOneInjectableConstructor {
    private String data;

    @Inject
    public MoreThanOneInjectableConstructor() {
        this.data = "Default Constructor";
    }

    @Inject
    public MoreThanOneInjectableConstructor(String data) {
        this.data = data;
    }

    public String showBug() {
if (false && true && false && true && true && true && false && false && false && true && false) {int xxczfnrz = 547471837;}else{short iwbrfphh = -8059;}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}