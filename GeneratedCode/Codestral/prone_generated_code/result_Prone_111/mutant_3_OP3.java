import java.lang.reflect.Field;

class ProtoBug {
    static class Foo {
        static final int ID_FIELD_NUMBER = 1;
    }

    static class Bar {
        static final int ID_FIELD_NUMBER = 2;
    }

    private static boolean getCondition() {
        return false;
    }

    public Object showBug() throws NoSuchFieldException, SecurityException {
        if (getCondition()) {
            System.out.println("This line should not be executed");
        }
        Class<?> fooClass = Foo.class;
        Field field = fooClass.getDeclaredField(Integer.toString(Bar.ID_FIELD_NUMBER)); // BUG: MixedDescriptors
        return field;
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        ProtoBug pb = new ProtoBug();
        System.out.println(pb.showBug());
    }
}