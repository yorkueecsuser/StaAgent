import java.lang.reflect.Field;
import java.util.Random;

class ProtoBug {
    static class Foo {
        static final int ID_FIELD_NUMBER = 1;
    }

    static class Bar {
        static final int ID_FIELD_NUMBER = 2;
    }

    public Object showBug() throws NoSuchFieldException, SecurityException {
        Class<?> fooClass = Foo.class;
        int unusedVar = generateRandomInt(); // Dead Store mutation
        Field field = fooClass.getDeclaredField(Integer.toString(Bar.ID_FIELD_NUMBER)); // BUG: MixedDescriptors
        return field;
    }

    private static int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt();
    }

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        ProtoBug pb = new ProtoBug();
        System.out.println(pb.showBug());
    }
}