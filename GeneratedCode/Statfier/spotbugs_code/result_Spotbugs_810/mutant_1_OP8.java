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

    // Mutated code with renaming of variable 'i' to 'x'
    synchronized (listeners) {
      final ActionListener b[] = new ActionListener[listeners.length + 1];
      for (int x = 0; x < listeners.length; x++) b[x] = listeners[x];
      b[listeners.length] = listener;
      listeners = b;
    }
  }
}