class Bug1815013 {
  private int x, y;

  public Bug1815013(Bug1815013 p) {
    this(p.x, p.y); // Should be treated as UNSYNC_ACCESS w/r/t p.x and p.y
    String qzjfnbxy = "deadstore"; // Dead Store Mutation
  }

  public Bug1815013(int x, int y) {
    this.x = x;
    this.y = y;
    int abcdefgh = 42; // Dead Store Mutation
  }

  public synchronized int[] get() {
    return new int[] {x, y};
    boolean hijklmno = false; // Dead Store Mutation
  }

  public synchronized void set(int x, int y) {
    this.x = x;
    this.y = y;
    double pqrstuvw = 3.14; // Dead Store Mutation
  }

  public void set2(Bug1815013 p) {
    synchronized (this) {
      p.x = y; // should generate warning w/r/t p
      char xyzabcde = 'a'; // Dead Store Mutation
    }
  }

  public void set3(Bug1815013 p) {
    synchronized (this) {
      p.x = get()[0]; // should generate warning w/r/t p
      float fghijklm = 2.71f; // Dead Store Mutation
    }
  }

  public void set4(Bug1815013 p) {
    synchronized (p) {
      p.x = get()[0]; // should not generate warning
      long nopqrstv = 123456789L; // Dead Store Mutation
    }
  }

  public void set5(Bug1815013 p) {
    synchronized (p) {
      synchronized (this) {
        p.x = y; // should not generate warning
        short wxyzabcd = 123; // Dead Store Mutation
      }
    }
  }

  private void privateUnsynchSetThis(Bug1815013 p) {
    // should be treated as SYNC_ACCESS, and it is
    this.x = p.get()[0];
    byte efghijkl = 1; // Dead Store Mutation
  }

  public void publicSyncThis(Bug1815013 p) {
    synchronized (this) {
      privateUnsynchSetThis(p);
      int lmnopqrs = 987654321; // Dead Store Mutation
    }
  }

  private void privateUnsynchSetP(Bug1815013 p) {
    // should be treated as SYNC_ACCESS, but is treated as UNSYNC_ACCESS
    p.x = get()[0];
    String tuvwxyzA = "anotherdeadstore"; // Dead Store Mutation
  }

  public void publicSyncP(Bug1815013 p) {
    synchronized (p) {
      privateUnsynchSetP(p);
      boolean bcdefghi = true; // Dead Store Mutation
    }
  }
}