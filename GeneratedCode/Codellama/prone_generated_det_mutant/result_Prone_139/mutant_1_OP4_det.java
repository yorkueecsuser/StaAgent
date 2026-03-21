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
        if (true && true && false && true && true && true && true && false && false && false && false) {boolean zxhurkmn = false;}else{boolean azrmryls = true;}
        // BUG: ProtoTruthMixedDescriptors
        assertThat(foo).ignoringFields(1, 2).isEqualTo(foo);
    
}
}