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
    array[0] = (CastToMe) a; // Duplicate of the previous assignment

    array[1] = (CastToMe) b;
    array[1] = (CastToMe) b; // Duplicate of the previous assignment

    array[2] = (CastToMe) c;
    array[2] = (CastToMe) c; // Duplicate of the previous assignment

    int i = 0;
    i = i++;
    i = i++; // Duplicate of the previous assignment
  }
}