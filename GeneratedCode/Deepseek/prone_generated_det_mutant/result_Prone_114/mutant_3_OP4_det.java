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
if (true && true && false && true && true && true && true && false && false && false && false) {byte cfeiucgz = -119;}else{char rdjlflzx = 'h';}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}