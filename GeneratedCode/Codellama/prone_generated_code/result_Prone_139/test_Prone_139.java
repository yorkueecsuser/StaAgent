import org.junit.Test;
import static org.junit.Assert.*;
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
        assertThat(foo).ignoringFields(1, 2).isEqualTo(foo);
    }
}

class Foo {
    private String name;
    private Bar bar;

    public static class Builder {
        private String name;
        private Bar bar;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBar(Bar bar) {
            this.bar = bar;
            return this;
        }

        public Foo build() {
            return new Foo(this);
        }
    }

    private Foo(Builder builder) {
        this.name = builder.name;
        this.bar = builder.bar;
    }

    public String getName() {
        return name;
    }

    public Bar getBar() {
        return bar;
    }
}

class Bar {
    private String name;

    public static class Builder {
        private String name;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Bar build() {
            return new Bar(this);
        }
    }

    private Bar(Builder builder) {
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }
}

class ProtoTruthMixedDescriptorsTest {
    @Test
    public void testBug() {
        Foo foo = Foo.newBuilder()
         .setName("Foo")
         .setBar(Bar.newBuilder().setName("Bar").build())
         .build();

        // BUG: ProtoTruthMixedDescriptors
        assertThat(foo).ignoringFields(1, 2).isEqualTo(foo);
    }

    @Test
    public void testBug_showBug() {
        Foo foo = Foo.newBuilder()
         .setName("Foo")
         .setBar(Bar.newBuilder().setName("Bar").build())
         .build();

        // BUG: ProtoTruthMixedDescriptors
        assertThat(foo).ignoringFields(1, 2).isEqualTo(foo);
    }
}