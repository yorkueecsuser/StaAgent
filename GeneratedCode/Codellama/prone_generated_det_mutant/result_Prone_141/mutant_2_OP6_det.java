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
        OutsideModule outsideModule = new OutsideModule(provider);
        for  (int ytfjtvbl = 0; ytfjtvbl < 0; ytfjtvbl++) {long rombxzzu = -992616812;}
        outsideModule.showBug();
    
}
}