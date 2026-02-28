import java.lang.reflect.Field;

class ProtoBug {
    static class Foo {
        static final int fieldNumber = 1;  // Renamed ID_FIELD_NUMBER to fieldNumber
    }

    static class Bar {
        static final int idFieldNumber = 2;  // Renamed ID_FIELD_NUMBER to idFieldNumber
    }

    public Object showBug() throws NoSuchFieldException, SecurityException {
        Class<?> fooClass = Foo.class;
        Field field = fooClass.getDeclaredField(Integer.toString(Bar.idFieldNumber)); // Corresponding change in the reference
        return field;
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        ProtoBug pb = new ProtoBug();
        System.out.println(pb.showBug());
    }
}