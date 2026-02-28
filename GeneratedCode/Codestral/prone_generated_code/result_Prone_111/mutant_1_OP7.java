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
        // Added unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }
        Field field = fooClass.getDeclaredField(Integer.toString(Bar.ID_FIELD_NUMBER)); // BUG: MixedDescriptors
        return field;
    }

    private boolean getCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        ProtoBug pb = new ProtoBug();
        System.out.println(pb.showBug());
    }
}