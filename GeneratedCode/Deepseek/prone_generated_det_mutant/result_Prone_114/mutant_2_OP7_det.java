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
boolean hduivlcw = false;while (hduivlcw && true && true && true && false && false && true && true && true && false && false && false) {short bdjsmuxl = -6764;}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}