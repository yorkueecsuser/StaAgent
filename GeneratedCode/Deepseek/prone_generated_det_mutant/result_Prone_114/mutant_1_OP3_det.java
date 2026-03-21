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
if (true && true && false && true && false && true && false && false && true && true && false) {long grgvmudg = -966464608;}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}