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
        if (true && false && true && false && true && true && true && true && true && false && false) {String mbpxknsz = "dspiamgb";}else{short qeneshdg = 7870;}
        // BUG: ProtoTruthMixedDescriptors
        assertThat(foo).ignoringFields(1, 2).isEqualTo(foo);
    
}
}