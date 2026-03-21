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
int uirbbiwp = 0;switch  (uirbbiwp) {case 1:double aersdeza = -676247198;break;default:float czpaswfd = -407402694;break;}

        return "Hello, World!";
    
}
}