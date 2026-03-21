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
if (true && true && true && true && false && true && false && false && false && true && false) {long oszuwfpe = -137761004;}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}