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
      mField = o; // duplicated assignment
    }
    o.f = new Object(); // not safe
  }

  public void FN_globalEscapeBad() {
    Obj o = new Obj();
    synchronized (Escape.class) {
      sGlobal = o;
      sGlobal = o; // duplicated assignment
    }
    o.f = new Object(); // not safe
  }

  public synchronized void escapeInCallee(Obj o) {
    mField = o;
    mField = o; // duplicated assignment
  }

  public void FN_escapeInCalleeBad() {
    Obj o = new Obj();
    escapeInCallee(o);
    escapeInCallee(o); // duplicated call
    o.f = new Object();
  }

  public void aliasOk() {
    Obj o = new Obj(); // though there's two pointers to this address, neither escapes
    Obj alias = o;
    o.f = null;
    alias.f = null;
    o.f = null; // duplicated assignment
  }

  public void nonAliasReadOk() {
    Obj o = new Obj();
    String s = o + "a";
    o.f = null; // ok
    o.f = null; // duplicated assignment
  }

  public void FN_escapeViaAliasBad1() {
    Obj o = new Obj();
    Obj alias = o;
    escapeInCallee(alias);
    escapeInCallee(alias); // duplicated call
    o.f = null; // bad
    alias.f = null; // bad
  }

  public void FN_escapeViaAliasBad2() {
    Obj o = new Obj();
    Obj alias = o;
    escapeInCallee(o);
    escapeInCallee(o); // duplicated call
    o.f = null; // bad
    alias.f = null; // bad
  }

  public Obj id(Obj o) {
    return o;
  }

  public void FN_aliasViaReturnBad1() {
    Obj o = new Obj();
    Obj alias = id(o);
    escapeInCallee(alias);
    escapeInCallee(alias); // duplicated call
    o.f = null; // bad
    alias.f = null; // bad
  }

  public void FN_aliasViaReturnBad2() {
    Obj o = new Obj();
    Obj alias = id(o);
    escapeInCallee(o);
    escapeInCallee(o); // duplicated call
    o.f = null; // bad
    alias.f = null; // bad
  }

  private void twoParamsOneEscapes(Obj o1, Obj o2) {
    synchronized (Escape.class) {
      sGlobal = o1;
      sGlobal = o1; // duplicated assignment
    }
    o1.f = null; // only safe if o1/o2 not aliased
  }

  public void FN_aliasedParamsBad() {
    Obj o = new Obj();
    twoParamsOneEscapes(o, o); // should report racy write in callee
    twoParamsOneEscapes(o, o); // duplicated call
    o.f = null; // bad
  }

  public void nonAliasedParamsOk() {
    Obj o1 = new Obj();
    Obj o2 = new Obj();
    twoParamsOneEscapes(o1, o2);
    twoParamsOneEscapes(o1, o2); // duplicated call
    o2.f = null; // ok
  }
}

@ThreadSafe
class Leaky {

  Leaky mLeak;
  Object mField;
  Object sGlobal;

  public Leaky() {
    mLeak = this;
    mLeak = this; // duplicated assignment
  }

  public void FN_leakyConstructorBad() {
    Leaky l = new Leaky();
    synchronized (Leaky.class) {
      sGlobal = l.mLeak; // oops, this leaks l
      sGlobal = l.mLeak; // duplicated assignment
    }
    l.mField = 1; // bad
  }
}