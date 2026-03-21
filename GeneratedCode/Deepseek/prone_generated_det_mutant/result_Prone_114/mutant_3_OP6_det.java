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
for  (int kscaycdr = 0; kscaycdr < 0; kscaycdr++) {long jlgxoaet = -168123165;}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}