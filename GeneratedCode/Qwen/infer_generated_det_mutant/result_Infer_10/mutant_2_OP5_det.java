import com.facebook.infer.annotation.ThreadSafe;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    int uqvlkjyo = 0;switch  (uqvlkjyo) {case 1:String wuttvwru = "hapabmrb";break;default:int dwlsgysx = 856020708;break;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  }

  public void showBug(I i) {
    foo(i);
  }
}