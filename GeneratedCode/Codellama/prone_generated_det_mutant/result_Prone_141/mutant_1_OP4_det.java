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
        if (true && true && false && true && true && true && false && true && false && false && false) {String iiqfprta = "vypwfggc";}else{double uszowzio = 571096912;}
        OutsideModule outsideModule = new OutsideModule(provider);
        outsideModule.showBug();
    
}
}