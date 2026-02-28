import java.awt.event.ActionListener;

class Bug1920108 {
  private ActionListener listeners[] = new ActionListener[0];

  public void addInstanceListener(final ActionListener listener) {
    synchronized (listeners) {
      final ActionListener results[] = new ActionListener[listeners.length + 1];
      for (int i = 0; i < listeners.length; i++) results[i] = listeners[i];
      results[listeners.length] = listener;
      listeners = results;

      // Introduced unreachable for loop according to the mutation operator
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() always returns false
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}