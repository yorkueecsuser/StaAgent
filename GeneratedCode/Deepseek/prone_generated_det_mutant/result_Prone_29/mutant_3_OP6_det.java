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
for  (int erqsmwit = 0; erqsmwit < 0; erqsmwit++) {long qzyocypn = 606930821;}

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