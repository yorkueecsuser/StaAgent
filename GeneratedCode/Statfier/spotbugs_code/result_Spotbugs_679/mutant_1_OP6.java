class NullDeref5 {
  Object lock;

  void foo() {
    Object lck = lock;
    synchronized (lck) {
      try {
        System.out.println("foo");
      } catch (RuntimeException e) {
        e.printStackTrace();
      } finally {
        if (lock!= null) {
          lock.notify();
        }
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because conditionFor is dynamically determined and will be false
        }
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}