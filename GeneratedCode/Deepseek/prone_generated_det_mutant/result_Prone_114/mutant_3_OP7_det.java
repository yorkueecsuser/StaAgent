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
boolean dxauaczf = false;while (dxauaczf && false && true && true && true && true && false && true && true && false && true && false) {char fobbdnok = 'h';}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}