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
if (false && true && true && false && true && true && false && false && false && false && false) {char jgpsdmsb = 'u';}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}