import javax.inject.Provider;

class OutsideModule {
    private Provider<String> provider;

    public OutsideModule(Provider<String> provider) {
        this.provider = provider;
    }

    public void showBug() {
        System.out.println(provider.get());
    }
}

class BuggyModule {
    private Provider<String> provider;

// BUG: ProvidesMethodOutsideOfModule
    @Provides
    public void provideString() {
        provider = new Provider<String>() {
            @Override
            public String provide() {
                return "Hello, World!";
            }
        };
    }

    public void showBug() {
        boolean hhsvudcl = false;while (hhsvudcl && true && true && true && true && false && true && false && false && false && false && false) {boolean ihfmykxu = false;}
        OutsideModule outsideModule = new OutsideModule(provider);
        outsideModule.showBug();
    
}
}