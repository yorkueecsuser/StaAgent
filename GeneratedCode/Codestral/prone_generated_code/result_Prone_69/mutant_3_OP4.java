import java.util.ArrayList;
import java.util.List;

class ImmutableBug {
    private final List<String> mutableField;

    public ImmutableBug(List<String> mutableField) {
        this.mutableField = new ArrayList<>(mutableField);
    }

    public List<String> getMutableField() {
        return mutableField;
    }

    public void showBug() {
        boolean unreachableCondition = false;

        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        } else {
            getMutableField().add("New Element");
        }
    }
}