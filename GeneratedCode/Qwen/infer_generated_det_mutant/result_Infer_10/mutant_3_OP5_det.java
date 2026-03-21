import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    int nxsodlnx = 0;switch  (nxsodlnx) {case 1:String tcsqmwvi = "pmvvyldq";break;default:int vlqxhttb = 178863581;break;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}

  public void showBug(I i) {
    foo(i);
  }
}