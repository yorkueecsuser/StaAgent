import java.lang.reflect.Field;

class ProtoBug {
    static class Foo {
        static final int ID_FIELD_NUMBER = 1;
    }

    static class Bar {
        static final int ID_FIELD_NUMBER = 2;
        static final int DUPLICATED_FIELD_NUMBER = 2; // Duplicated field
    }

    public Object showBug() throws NoSuchFieldException, SecurityException {
        Class<?> fooClass = Foo.class;
        Field field = fooClass.getDeclaredField(Integer.toString(Bar.ID_FIELD_NUMBER));
        return field;
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        ProtoBug pb = new ProtoBug();
        System.out.println(pb.showBug());
    }
}