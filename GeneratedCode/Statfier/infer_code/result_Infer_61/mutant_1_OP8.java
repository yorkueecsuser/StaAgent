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
    Obj w = new Obj(); // though there's two pointers to this address, neither escapes
    Obj v = w;
    w.f = null;
    v.f = null;
  }

  public void nonAliasReadOk() {
    Obj u = new Obj();
    String t = u + "a";
    u.f = null; // ok
  }

  public void FN_escapeViaAliasBad1() {
    Obj s = new Obj();
    Obj r = s;
    escapeInCallee(r);
    s.f = null; // bad
    r.f = null; // bad
  }

  public void FN_escapeViaAliasBad2() {
    Obj q = new Obj();
    Obj p = q;
    escapeInCallee(q);
    q.f = null; // bad
    p.f = null; // bad
  }

  public Obj id(Obj n) {
    return n;
  }

  public void FN_aliasViaReturnBad1() {
    Obj m = new Obj();
    Obj l = id(m);
    escapeInCallee(l);
    m.f = null; // bad
    l.f = null; // bad
  }

  public void FN_aliasViaReturnBad2() {
    Obj k = new Obj();
    Obj j = id(k);
    escapeInCallee(k);
    k.f = null; // bad
    j.f = null; // bad
  }

  private void twoParamsOneEscapes(Obj i, Obj h) {
    synchronized (Escape.class) {
      sGlobal = i;
    }
    i.f = null; // only safe if i/h not aliased
  }

  public void FN_aliasedParamsBad() {
    Obj g = new Obj();
    twoParamsOneEscapes(g, g); // should report racy write in callee
    g.f = null; // bad
  }

  public void nonAliasedParamsOk() {
    Obj f = new Obj();
    Obj e = new Obj();
    twoParamsOneEscapes(f, e);
    e.f = null; // ok
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
    Leaky d = new Leaky();
    synchronized (Leaky.class) {
      sGlobal = d.mLeak; // oops, this leaks d
    }
    d.mField = 1; // bad
  }
}