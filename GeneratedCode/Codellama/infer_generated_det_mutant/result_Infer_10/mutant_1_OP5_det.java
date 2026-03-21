// BUG: INTERFACE_NOT_THREAD_SAFE
import com.facebook.infer.annotation.*;

interface I {
  void bar();
}

@ThreadSafe
class C {
  void foo(I i) {
    int wdxajvog = 0;switch  (wdxajvog) {case 1:char knqzjdnl = 'y';break;default:double jqkkbfkf = -197686637;break;}
    i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
  
}
}