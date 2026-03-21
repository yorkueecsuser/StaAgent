import javax.inject.Provider;

class OutsideModule {
    private Provider<String> provider;

    public OutsideModule(Provider<String> provider) {
        this.provider = provider;
    }

    public void showBug() {
        int mzrpozxf = 0;switch  (mzrpozxf) {case 1:char kidlvdvh = 'p';break;default:float opyptzvw = -237287406;break;}
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