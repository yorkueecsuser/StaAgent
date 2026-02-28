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

        // Inserted unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                System.out.println("This code is unreachable.");
                break;
            default:
                // Continue with the original code
                break;
        }

        Field field = fooClass.getDeclaredField(Integer.toString(Bar.ID_FIELD_NUMBER));
        return field;
    }

    // Method to return an unreachable value
    private int getUnreachableValue() {
        return 0;
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        ProtoBug pb = new ProtoBug();
        System.out.println(pb.showBug());
    }
}