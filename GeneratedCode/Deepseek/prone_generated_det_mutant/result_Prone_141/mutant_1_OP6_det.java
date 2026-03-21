import javax.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Provides;

class BuggyClass {
    private final Provider<String> stringProvider;

    @Inject
    public BuggyClass(Provider<String> stringProvider) {
        this.stringProvider = stringProvider;
    }

    public String getString() {
        return stringProvider.get();
    }

    // BUG: ProvidesMethodOutsideOfModule
    @Provides
    public String provideString() {
for  (int pclhxnri = 0; pclhxnri < 0; pclhxnri++) {short jbkamhrm = -2985;}

        return "Hello, World!";
    
}
}