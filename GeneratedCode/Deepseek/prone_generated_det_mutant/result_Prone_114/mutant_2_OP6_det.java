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
for  (int ajgdodcr = 0; ajgdodcr < 0; ajgdodcr++) {long cqijizcp = 335786083;}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}