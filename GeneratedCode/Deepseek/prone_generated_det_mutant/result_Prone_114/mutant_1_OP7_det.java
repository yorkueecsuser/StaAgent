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
boolean bhrwlscp = false;while (bhrwlscp && true && true && false && false && true && true && false && false && false && false && false) {char badzlwoe = 'l';}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}