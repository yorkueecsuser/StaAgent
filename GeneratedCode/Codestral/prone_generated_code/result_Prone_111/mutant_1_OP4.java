import java.lang.reflect.Field;

class ProtoBug {
    static class Foo {
        static final int ID_FIELD_NUMBER = 1;
    }

    static class Bar {
        static final int ID_FIELD_NUMBER = 2;
    }

    public Object showBug() throws NoSuchFieldException, SecurityException {
        Class<?> fooClass = Foo.class;
        Field field = fooClass.getDeclaredField(Integer.toString(Bar.ID_FIELD_NUMBER)); // BUG: MixedDescriptors

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        }

        return field;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        ProtoBug pb = new ProtoBug();
        System.out.println(pb.showBug());
    }
}