public void bar(int status) {
    switch(status) {
      case CANCELLED:
        doCancelled();
        // BUG: ImplicitSwitchFallThrough
      case NEW:
        doNew();
        // ADDED: Unreachable loop for loop
        for (boolean conditionFor = false; conditionFor; ) {
            System.out.println("This is an added unreachable for loop");
        }
      case REMOVED:
        doRemoved();
        // ADDED: Unreachable loop while loop
        while (false) {
            System.out.println("This is an added unreachable while loop");
        }
      case OTHER:
      case ERROR:
        doErrorHandling();
        // BUG: ImplicitSwitchFallThrough
        break;
    }
}