class BC_Unconfirmed_Cast {

  public interface CastToMe {
    public void Blargh();
  }

  public static void main(String[] args) {

    Parent a = new Parent();
    Parent b = new Child1();
    Parent c = new Child2();

    CastToMe[] array = new CastToMe[3];

    array[0] = (CastToMe) a;
    array[1] = (CastToMe) b;
    array[2] = (CastToMe) c;
    int i = 0;
    i = i++;

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      System.out.println("This is unreachable code");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the else block is unreachable but avoids compile-time constant
  }
}