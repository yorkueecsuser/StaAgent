import java.awt.event.ActionListener;

class Bug1920108 {
  private ActionListener listeners[] = new ActionListener[0];

  public void addInstanceListener(final ActionListener listener) {
    synchronized (listeners) {
      final ActionListener results[] = new ActionListener[listeners.length + 1];
      int i = 0;
      do {
        results[i] = listeners[i];
        i++;
      } while (i < listeners.length);
      results[listeners.length] = listener;
      listeners = results;
    }
  }
}