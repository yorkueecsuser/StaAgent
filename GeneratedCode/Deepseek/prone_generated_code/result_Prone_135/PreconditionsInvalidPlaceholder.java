import com.google.common.base.Preconditions;

class PreconditionsInvalidPlaceholder {

    public void showBug(String arg) {
        try {
            Preconditions.checkArgument(arg.length() > 5, "Error length: %d", arg.length()); // BUG: PreconditionsInvalidPlaceholder
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        PreconditionsInvalidPlaceholder bug = new PreconditionsInvalidPlaceholder();
        bug.showBug("Hello");
    }
}