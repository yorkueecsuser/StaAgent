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

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}