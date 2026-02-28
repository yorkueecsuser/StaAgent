import java.awt.event.ActionListener;

class Bug1920108 {
  private ActionListener listeners[] = new ActionListener[0];

  public void addInstanceListener(final ActionListener listener) {
    synchronized (listeners) {
      // Inserting an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will always return false
      }

      final ActionListener results[] = new ActionListener[listeners.length + 1];
      for (int i = 0; i < listeners.length; i++) results[i] = listeners[i];
      results[listeners.length] = listener;
      listeners = results;
    }
  }

  // Method to simulate a condition that is always false
  private boolean getCondition() {
    return false;
  }
}