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
        switch(status) {
          case CANCELLED:
            doCancelled();
            // Mutation: Unreachable if statement
          if (false) {
            doNew();
          }
          case REMOVED:
            doRemoved();
          case OTHER:
          case ERROR:
            doErrorHandling();
            // Mutation: Unreachable if statement
            if (false) {
              break;
            }
        }
    }

    public void showBug() {
        bar(NEW);
    }
}