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

    // Mutated code
    Parent x = new Parent();
    Parent y = new Child1();
    Parent z = new Child2();

    CastToMe[] arr = new CastToMe[3];

    arr[0] = (CastToMe) x;
    arr[1] = (CastToMe) y;
    arr[2] = (CastToMe) z;
    int j = 0;
    j = j++;
  }
}