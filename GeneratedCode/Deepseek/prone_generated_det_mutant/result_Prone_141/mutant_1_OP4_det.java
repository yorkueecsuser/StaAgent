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
if (true && true && false && false && false && true && false && false && false && false && false) {String uzcwxawn = "yyfohcgb";}else{boolean yvztsifx = true;}

        return "Hello, World!";
    
}
}