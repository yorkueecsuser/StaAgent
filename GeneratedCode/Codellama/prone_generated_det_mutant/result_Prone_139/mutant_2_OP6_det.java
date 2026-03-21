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
        for  (int vnnjhjcc = 0; vnnjhjcc < 0; vnnjhjcc++) {short jwsrckni = -2403;}
        assertThat(foo).ignoringFields(1, 2).isEqualTo(foo);
    
}
}