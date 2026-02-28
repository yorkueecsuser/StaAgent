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

    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  // Method to provide a dynamically determined false condition
  private static boolean getUnreachableCondition() {
    return false;
  }
}