import java.util.ArrayList;
import java.util.List;

class SpELBug {
    private String invalidSpEL = "#{T(java.lang.Runtime).getRuntime().exec('calc').equals('calc')}";

    public List<String> showBug() {
        List<String> result = new ArrayList<>();
        result.add(invalidSpEL);
        // BUG: SpEL expression should have a valid syntax
        return result;
    }
}