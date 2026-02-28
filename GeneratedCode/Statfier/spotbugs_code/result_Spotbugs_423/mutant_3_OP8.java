class Bug1815013 {
  private int x, y;

  public Bug1815013(Bug1815013 p) {
    this(p.x, p.y); // Should be treated as UNSYNC_ACCESS w/r/t p.x and p.y
  }

  public Bug1815013(int a, int b) {
    this.x = a;
    this.y = b;
  }

  public synchronized int[] get() {
    return new int[] {x, y};
  }

  public synchronized void set(int a, int b) {
    this.x = a;
    this.y = b;
  }

  public void set2(Bug1815013 q) {
    synchronized (this) {
      q.x = y; // should generate warning w/r/t q
    }
  }

  public void set3(Bug1815013 r) {
    synchronized (this) {
      r.x = get()[0]; // should generate warning w/r/t r
    }
  }

  public void set4(Bug1815013 s) {
    synchronized (s) {
      s.x = get()[0]; // should not generate warning
    }
  }

  public void set5(Bug1815013 t) {
    synchronized (t) {
      synchronized (this) {
        t.x = y; // should not generate warning
      }
    }
  }

  private void privateUnsynchSetThis(Bug1815013 u) {
    // should be treated as SYNC_ACCESS, and it is
    this.x = u.get()[0];
  }

  public void publicSyncThis(Bug1815013 v) {
    synchronized (this) {
      privateUnsynchSetThis(v);
    }
  }

  private void privateUnsynchSetP(Bug1815013 w) {
    // should be treated as SYNC_ACCESS, but is treated as UNSYNC_ACCESS
    w.x = get()[0];
  }

  public void publicSyncP(Bug1815013 z) {
    synchronized (z) {
      privateUnsynchSetP(z);
    }
  }
}