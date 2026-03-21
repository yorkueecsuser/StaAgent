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
if (true && false && true && false && false && true && true && true && true && false && false) {long ekffgpib = 503572728;}else{double yhijjnta = -23839241;}

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