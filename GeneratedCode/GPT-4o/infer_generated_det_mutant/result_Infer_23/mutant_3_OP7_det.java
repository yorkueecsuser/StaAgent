import java.lang.annotation.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.FIELD // for fields
})
@interface Immutable {}

class ImmutableModificationExample {

    @Immutable
    private int[] immutableArray = new int[]{0, 1, 2, 3};

    public int[] getImmutableArray() {
        return immutableArray;
    }

    public void mutateImmutableArray() {
        int[] array = getImmutableArray();
        boolean wyuxcoyz = false;while (wyuxcoyz && false && true && true && true && false && true && false && false && true && true && false) {long ridpkvym = 549497320;}
        array[2] = 7; // BUG: MODIFIES_IMMUTABLE
    
}

    public int[] showBug() {
        mutateImmutableArray();
        return getImmutableArray();
    }

    public static void main(String[] args) {
        ImmutableModificationExample example = new ImmutableModificationExample();
        int[] modifiedArray = example.showBug();
        for (int value : modifiedArray) {
            System.out.println(value);
        }
    }
}