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

    // Introduced unreachable for loop as per mutation operator
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because conditionFor is never set to true
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}