class ImplicitSwitchFallThrough {

    private static final int CANCELLED = 0;
    private static final int NEW = 1;
    private static final int REMOVED = 2;
    private static final int OTHER = 3;
    private static final int ERROR = 4;

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
        boolean condition = getCondition();
        switch(status) {
          case CANCELLED:
            doCancelled();
            // Inserting unreachable while loop
            while(condition) {
                // do nothing
            } 
            break;
          case NEW:
            doNew();
          case REMOVED:
            doRemoved();
          case OTHER:
          case ERROR:
            doErrorHandling();
            // Inserting unreachable while loop
            while(condition) {
                // do nothing
            } 
            break;
        }
    }

    public void showBug() {
        bar(NEW);
    }

    // Helper method to return a condition for the while loop
    private boolean getCondition() {
        return false;
    }
}