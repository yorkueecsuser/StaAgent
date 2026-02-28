import java.awt.event.ActionListener;

class Bug1920108 {
  private ActionListener listeners[] = new ActionListener[0];

  public void addInstanceListener(final ActionListener listener) {
    synchronized (listeners) {
      final ActionListener results[] = new ActionListener[listeners.length + 1];
      for (int i = 0; i < listeners.length; i++) results[i] = listeners[i];
      results[listeners.length] = listener;
      listeners = results;
    }
    // Mutated code with renaming operator
    synchronized (listeners) {
      final ActionListener x[] = new ActionListener[listeners.length + 1];
      for (int j = 0; j < listeners.length; j++) x[j] = listeners[j];
      x[listeners.length] = listener;
      listeners = x;
    }
  }
}