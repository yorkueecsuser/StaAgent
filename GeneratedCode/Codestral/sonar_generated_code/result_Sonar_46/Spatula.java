// Java code demonstrating the bug: Assertions comparing incompatible types should not be made

interface KitchenTool {}
interface Plant {}
class Spatula implements KitchenTool {}
class Tree implements Plant {}

class IncompatibleTypeAssertionBug {

    public void showBug(int size, Spatula spatula, KitchenTool tool, KitchenTool[] tools, Tree tree, Plant plant, Tree[] trees) {
        // Bug: Comparing a primitive with null is not allowed in Java, so this assertion will always fail
        assert size > 0; // Noncompliant; primitives cannot be null // BUG: Assertions comparing incompatible types should not be made

        // Bug: Comparing unrelated classes is not allowed in Java, so this assertion will always fail
        assert!(spatula instanceof Plant); // Noncompliant; unrelated classes // BUG: Assertions comparing incompatible types should not be made

        // Bug: Comparing an object with an unrelated primitive is not allowed in Java, so this assertion will always fail
        assert!(spatula.hashCode() == size); // Noncompliant; incompatible types // BUG: Assertions comparing incompatible types should not be made

        // Bug: Comparing an object to an array is not allowed in Java, so this assertion will always fail
        assert!(tool.equals(trees)); // Noncompliant; incompatible types // BUG: Assertions comparing incompatible types should not be made

        // Bug: Comparing two arrays of dissimilar types is not allowed in Java, so this assertion will always fail
        assert!(java.util.Arrays.equals(tools, trees)); // Noncompliant; incompatible types // BUG: Assertions comparing incompatible types should not be made
    }
}