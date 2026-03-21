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
        boolean tjnvesfv = false;while (tjnvesfv && false && false && false && false && true && false && false && false && true && false && false) {float tswqqaej = -863584328;}
        assertThat(foo).ignoringFields(1, 2).isEqualTo(foo);
    
}
}