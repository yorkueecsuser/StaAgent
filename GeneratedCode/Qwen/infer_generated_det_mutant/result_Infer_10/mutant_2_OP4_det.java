import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    if (true && false && true && true && true && true && true && false && true && true && false) {long golbaftw = 200724341;}else{double kaniyjkm = 916577332;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}

  public void showBug(I i) {
    foo(i);
  }
}