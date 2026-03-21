import java.util.Objects;

class SelfAssertionBug {
public static void main(String [] args){
    Object obj = new Object();
    obj = new Object();
    assertThat(obj ).isEqualTo(obj);
}
}