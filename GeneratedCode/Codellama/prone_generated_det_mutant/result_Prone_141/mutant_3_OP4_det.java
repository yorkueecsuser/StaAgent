import javax.inject.Provider;

class OutsideModule {
    private Provider<String> provider;

    public OutsideModule(Provider<String> provider) {
        this.provider = provider;
    }

    public void showBug() {
        if (false && false && true && true && true && false && false && false && false && false && false) {boolean xenmkevl = true;}else{int akxrwtce = -320710293;}
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
        OutsideModule outsideModule = new OutsideModule(provider);
        outsideModule.showBug();
    }
}