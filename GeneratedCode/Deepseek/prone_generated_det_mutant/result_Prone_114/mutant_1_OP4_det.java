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
if (true && true && false && false && false && false && true && true && true && false && false) {double ozncrnqc = -281095621;}else{double ibxhxmwc = -969720148;}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}