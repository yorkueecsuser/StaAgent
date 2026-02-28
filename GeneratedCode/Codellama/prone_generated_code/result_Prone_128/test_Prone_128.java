import org.junit.Test;
import javax.inject.Inject;

public class BuggyExample {
    private final Dependency dependency;

    @Inject
    public BuggyExample(Dependency dependency) {
        this.dependency = dependency;
    }
}