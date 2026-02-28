import java.lang.reflect.Field;
import java.util.Random;

class ProtoBug {
    static class Foo {
        static final int ID_FIELD_NUMBER = 1;
    }

    static class Bar {
        static final int ID_FIELD_NUMBER = 2;
    }

    private boolean getUnreachableCondition() {
        // This method will always return false to make the if-else statement unreachable
        Random rand = new Random();
        return rand.nextInt(2) == 0;
    }

    public Object showBug() throws NoSuchFieldException, SecurityException {
        Class<?> fooClass = Foo.class;
        Field field = fooClass.getDeclaredField(Integer.toString(Bar.ID_FIELD_NUMBER));

        // Adding an unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("This line should never be executed.");
        } else {
            System.out.println("This is the reachable part of the if-else statement.");
        }

        return field;
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        ProtoBug pb = new ProtoBug();
        System.out.println(pb.showBug());
    }
}