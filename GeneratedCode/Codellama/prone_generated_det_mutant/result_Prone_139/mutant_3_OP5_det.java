import java.util.Arrays;

class ProtoTruthMixedDescriptors {
    public static void main(String[] args) {
        Foo foo = Foo.newBuilder()
           .setName("Foo")
           .setBar(Bar.newBuilder().setName("Bar").build())
           .build();

        // BUG: ProtoTruthMixedDescriptors
        assertThat(foo).ignoringFields(1, 2).isEqualTo(foo);
    }

    public static void showBug(Foo foo) {
        int ruwwpwrp = 0;switch  (ruwwpwrp) {case 1:boolean esfjemfl = true;break;default:boolean pxmriefo = false;break;}
        // BUG: ProtoTruthMixedDescriptors
        assertThat(foo).ignoringFields(1, 2).isEqualTo(foo);
    
}
}