class ImplicitSwitchFallThrough {

    private static final int CANCELLED = 0;
    private static final int NEW = 1;
    private static final int REMOVED = 2;
    private static final int OTHER = 3;
    private static final int ERROR = 4;
    private static final String deadStore = "abcdefgh"; // Dead Store Mutation Operator

    public void doCancelled() {
        System.out.println("Cancelled");
    }

    public void doNew() {
        System.out.println("New");
    }

    public void doRemoved() {
        System.out.println("Removed");
    }

    public void doErrorHandling() {
        System.out.println("Error Handling");
    }

    public void bar(int status) {
        switch(status) {
        case CANCELLED:
            doCancelled();
            break;
        case NEW:
            doNew();
            break;
        case REMOVED:
            doRemoved();
            break;
        case OTHER:
        case ERROR:
            doErrorHandling();
            break;
        }
    }

    public void showBug() {
        bar(NEW);
    }
}