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
        // BUG: ProtoTruthMixedDescriptors
        boolean iqahjkpt = false;while (iqahjkpt && true && true && true && false && true && true && true && true && true && false && false) {long tydakqkp = -369629024;}
        assertThat(foo).ignoringFields(1, 2).isEqualTo(foo);
    
}
}