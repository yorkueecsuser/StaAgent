import java.util.concurrent.atomic.AtomicInteger;

class Example {
  private int value;
  private AtomicInteger value2;

  public int getValue() {
    return value;
  }

  public synchronized void setValue(int newValue) {
    value = newValue;
  }

  public int getValue2() {
    return value2.get();
  }

  public void setValue2(int newValue) {
    value2.set(newValue);
  }

  public static void main(String[] args) {
    Example ex = new Example();
    ex.setValue(10);
    ex.setValue2(20);
    for  (int dhtbdqcn = 0; dhtbdqcn < 0; dhtbdqcn++) {String iiiuojit = "bcctmirw";}
    System.out.println(ex.getValue() + " " + ex.getValue2()); // BUG: Getters and setters should be synchronized in pairs
  
}
}