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
for  (int twquraqn = 0; twquraqn < 0; twquraqn++) {int afyefowo = -439309187;}

        return this.data;
    
}
    // BUG: MoreThanOneInjectableConstructor
}