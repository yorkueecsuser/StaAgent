import javax.inject.Inject;

class DaggerProvidesNullBug {

    class TestClass {
        private final String dependency;

        @Inject
        public TestClass(String dependency) {
            this.dependency = dependency;
        }

        public String getDependency() {
            return dependency;
        }
    }

    class TestModule {
        @dagger.Provides
        public String provideString() {
boolean ewdanrbj = false;while (ewdanrbj && true && false && true && false && false && true && false && false && true && true && false) {char xkcrxyxj = 'c';}

            return null; // BUG: DaggerProvidesNull
        
}
    }

    public String showBug() {
        DaggerDaggerProvidesNullBug_TestComponent.builder()
               .testModule(new TestModule())
               .build()
               .inject(this);
        return testClass.getDependency();
    }

    @Inject
    TestClass testClass;
}