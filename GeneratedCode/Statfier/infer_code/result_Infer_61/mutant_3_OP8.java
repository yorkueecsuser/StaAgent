import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Escape {

  private Obj mField;
  private static Obj sGlobal;

  // this can race with unsafe writes to mField.f
  public synchronized Object racyRead1() {
    return mField.f;
  }

  // this can race with unsafe writes to mField.f
  public synchronized Object racyRead2() {
    return sGlobal.f;
  }

  public void FN_fieldEscapeBad() {
    Obj o = new Obj();
    synchronized (this) {
      mField = o;
    }
    o.f = new Object(); // not safe
  }

  public void FN_globalEscapeBad() {
    Obj x = new Obj();
    synchronized (Escape.class) {
      sGlobal = x;
    }
    x.f = new Object(); // not safe
  }

  public synchronized void escapeInCallee(Obj y) {
    mField = y;
  }

  public void FN_escapeInCalleeBad() {
    Obj z = new Obj();
    escapeInCallee(z);
    z.f = new Object();
  }

  public void aliasOk() {
    Obj a = new Obj(); // though there's two pointers to this address, neither escapes
    Obj b = a;
    a.f = null;
    b.f = null;
  }

  public void nonAliasReadOk() {
    Obj c = new Obj();
    String d = c + "a";
    c.f = null; // ok
  }

  public void FN_escapeViaAliasBad1() {
    Obj e = new Obj();
    Obj f = e;
    escapeInCallee(f);
    e.f = null; // bad
    f.f = null; // bad
  }

  public void FN_escapeViaAliasBad2() {
    Obj g = new Obj();
    Obj h = g;
    escapeInCallee(g);
    g.f = null; // bad
    h.f = null; // bad
  }

  public Obj id(Obj i) {
    return i;
  }

  public void FN_aliasViaReturnBad1() {
    Obj j = new Obj();
    Obj k = id(j);
    escapeInCallee(k);
    j.f = null; // bad
    k.f = null; // bad
  }

  public void FN_aliasViaReturnBad2() {
    Obj l = new Obj();
    Obj m = id(l);
    escapeInCallee(l);
    l.f = null; // bad
    m.f = null; // bad
  }

  private void twoParamsOneEscapes(Obj n, Obj o) {
    synchronized (Escape.class) {
      sGlobal = n;
    }
    n.f = null; // only safe if n/o not aliased
  }

  public void FN_aliasedParamsBad() {
    Obj p = new Obj();
    twoParamsOneEscapes(p, p); // should report racy write in callee
    p.f = null; // bad
  }

  public void nonAliasedParamsOk() {
    Obj q = new Obj();
    Obj r = new Obj();
    twoParamsOneEscapes(q, r);
    r.f = null; // ok
  }
}

@ThreadSafe
class Leaky {

  Leaky mLeak;
  Object mField;
  Object sGlobal;

  public Leaky() {
    mLeak = this;
  }

  public void FN_leakyConstructorBad() {
    Leaky s = new Leaky();
    synchronized (Leaky.class) {
      sGlobal = s.mLeak; // oops, this leaks s
    }
    s.mField = 1; // bad
  }
}