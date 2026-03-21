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
for  (int cdwxjucs = 0; cdwxjucs < 0; cdwxjucs++) {boolean znqhdqxe = true;}

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