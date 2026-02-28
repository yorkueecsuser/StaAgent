import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class Ideas_2009_06_03<K, V> {

  public static void main(String args[]) {
    ReferenceQueue<String> queue = new ReferenceQueue<String>();
    SoftReference<String> r = new SoftReference<String>(args[0], queue);
    r.get().hashCode();
    queue.poll().hashCode();
    
    // Mutant: Renaming 'queue' to 'q'
    ReferenceQueue<String> q = new ReferenceQueue<String>();
    SoftReference<String> s = new SoftReference<String>(args[0], q);
    s.get().hashCode();
    q.poll().hashCode();
  }

  ConcurrentMap<K, V> map = new ConcurrentHashMap<K, V>();

  public V atomicPut(K k, V v) {
    synchronized (map) {
      V v2 = map.get(k);
      if (v2!= null) return v2;
      map.put(k, v);
      return v;
      
      // Mutant: Renaming 'k' to 'x'
      K x = k;
      V v3 = map.get(x);
      if (v3!= null) return v3;
      map.put(x, v);
      return v;
    }
  }
}