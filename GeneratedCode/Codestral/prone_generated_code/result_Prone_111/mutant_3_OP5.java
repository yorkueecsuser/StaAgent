import java.lang.reflect.Field;

class ProtoBug {
    // original code
    static class Foo {
        static final int ID_FIELD_NUMBER = 1;
    }

    static class Bar {
        static final int ID_FIELD_NUMBER = 2;
    }

    public Object showBug() throws NoSuchFieldException, SecurityException {
        Class<?> fooClass = Foo.class;
        int fieldNumber = getUnreachableValue();
        switch(fieldNumber) {
            case Bar.ID_FIELD_NUMBER:
                // unreachable mutant code
                System.out.println("Unreachable code executed");
                break;
            default:
                break;
        }
        Field field = fooClass.getDeclaredField(Integer.toString(Bar.ID_FIELD_NUMBER));
        return field;
    }

    private int getUnreachableValue() {
        return -1;
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        ProtoBug pb = new ProtoBug();
        System.out.println(pb.showBug());
    }
}