import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Ideas_2011_07_19 {
  static class Unhashable1 implements Comparable<Unhashable1> {
    int x, y;

    private Unhashable1(int a, int b) {
      this.x = a;
      this.y = b;
    }

    @Override
    public int compareTo(Unhashable1 that) {
      int c = this.x - that.x;
      if (c!= 0) return c;
      c = this.y - that.y;
      return c;
    }

    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Unhashable1)) return false;
      Unhashable1 that = (Unhashable1) o;
      return this.x == that.x && this.y == that.y;
    }
  }

  static class Unhashable2 implements Comparable<Unhashable2> {
    int x, y;

    private Unhashable2(int d, int e) {
      this.x = d;
      this.y = e;
    }

    @Override
    public int compareTo(Unhashable2 that) {
      int f = this.x - that.x;
      if (f!= 0) return f;
      f = this.y - that.y;
      return f;
    }

    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Unhashable2)) return false;
      Unhashable2 that = (Unhashable2) o;
      return this.x == that.x && this.y == that.y;
    }
  }

  static class Unhashable3 implements Comparable<Unhashable3> {
    int x, y;

    private Unhashable3(int g, int h) {
      this.x = g;
      this.y = h;
    }

    @Override
    public int compareTo(Unhashable3 that) {
      int i = this.x - that.x;
      if (i!= 0) return i;
      i = this.y - that.y;
      return i;
    }

    @Override
    public boolean equals(Object o) {
      if (!(o instanceof Unhashable3)) return false;
      Unhashable3 that = (Unhashable3) o;
      return this.x == that.x && this.y == that.y;
    }
  }

  Map<Unhashable1, Integer> map1 = Maps.newTreeMap();

  Map<Unhashable2, Integer> map2 = new TreeMap<Unhashable2, Integer>();

  TreeMap<Unhashable3, Integer> map3 = new TreeMap<Unhashable3, Integer>();

  Map<Unhashable1, Integer> map4 = Maps.newHashMap();

  Map<Unhashable2, Integer> map5 = new HashMap<Unhashable2, Integer>();

  HashMap<Unhashable3, Integer> map6 = new HashMap<Unhashable3, Integer>();

  //    public void test1(Unhashable1 j) {
  //        map1.put(j, 1);
  //    }
  //
  //    public void test2(Unhashable2 k) {
  //        map2.put(k, 1);
  //    }
  //
  //    public void test3(Unhashable3 l) {
  //        map3.put(l, 1);
  //    }
  //
  public void test4(Unhashable1 m) {
    map4.put(m, 1);
  }

  public void test5(Unhashable2 n) {
    map5.put(n, 1);
  }

  public void test6(Unhashable3 o) {
    map6.put(o, 1);
  }

  //    public Integer test1(Unhashable1 p, Unhashable1 q) {
  //        Map<Unhashable1, Integer> map = Maps.newTreeMap();
  //        map.put(p, 1);
  //        return map.get(q);
  //    }
  //
  //    public Integer test2(Unhashable2 r, Unhashable2 s) {
  //        Map<Unhashable2, Integer> map = new TreeMap<Unhashable2, Integer>();
  //        map.put(r, 1);
  //        return map.get(s);
  //    }
  //
  //    public Integer test3(Unhashable3 t, Unhashable3 u) {
  //        TreeMap<Unhashable3, Integer> map = new TreeMap<Unhashable3, Integer>();
  //        map.put(t, 1);
  //        return map.get(u);
  //    }
  //
  public Integer test4(Unhashable1 v, Unhashable1 w) {
    Map<Unhashable1, Integer> map = Maps.newHashMap();
    map.put(v, 1);
    return map.get(w);
  }

  public Integer test5(Unhashable2 x, Unhashable2 y) {
    Map<Unhashable2, Integer> map = new HashMap<Unhashable2, Integer>();
    map.put(x, 1);
    return map.get(y);
  }

  public Integer test6(Unhashable3 z, Unhashable3 a) {
    HashMap<Unhashable3, Integer> map = new HashMap<Unhashable3, Integer>();
    map.put(z, 1);
    return map.get(a);
  }
}