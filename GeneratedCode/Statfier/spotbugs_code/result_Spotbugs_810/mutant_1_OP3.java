import java.awt.event.ActionListener;

class Bug1920108 {
  private ActionListener listeners[] = new ActionListener[0];

  public void addInstanceListener(final ActionListener listener) {
    synchronized (listeners) {
      final ActionListener results[] = new ActionListener[listeners.length + 1];
      for (int i = 0; i < listeners.length; i++) results[i] = listeners[i];
      results[listeners.length] = listener;
      listeners = results;

      // Inserting unreachable if branch
      boolean condition = getUnreachableCondition();
      if (condition) {
        // This block is unreachable
        System.out.println("This is an unreachable block");
      }
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}