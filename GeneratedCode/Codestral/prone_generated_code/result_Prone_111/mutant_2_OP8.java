import java.lang.reflect.Field;

class ProtoBug {
    static class Foo {
        static final int a = 1; // Mutated: Renamed ID_FIELD_NUMBER to a
    }

    static class Bar {
        static final int ID_FIELD_NUMBER = 2;
    }

    public Object showBug() throws NoSuchFieldException, SecurityException {
        Class<?> fooClass = Foo.class;
        Field field = fooClass.getDeclaredField(Integer.toString(Bar.ID_FIELD_NUMBER)); // BUG: MixedDescriptors
        return field;
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        ProtoBug pb = new ProtoBug();
        System.out.println(pb.showBug());
    }
}