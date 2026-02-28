interface KitchenTool {}
interface Plant {}
class Spatula implements KitchenTool {}
class Tree implements Plant {}

class AssertionDemo {

    public void showBug(int size, Spatula spatula, KitchenTool tool, KitchenTool[] tools, Tree tree, Plant plant, Tree[] trees) {
        // Whatever the given values, those negative assertions will always pass due to dissimilar types:
        assert size != 0; // Noncompliant; primitives can not be null // BUG: Assertions comparing incompatible types should not be made
        assert spatula != null; // Noncompliant; replace tree with null to fix compilation // BUG: Assertions comparing incompatible types should not be made
        assert tool != null; // Noncompliant; replace tools with null to fix compilation // BUG: Assertions comparing incompatible types should not be made
        assert trees != null; // Noncompliant; replace tools with null to fix compilation // BUG: Assertions comparing incompatible types should not be made

        // Those assertions will always fail
        assert size == 0; // Noncompliant // BUG: Assertions comparing incompatible types should not be made
        assert spatula == null; // Noncompliant; replace tree with null to fix compilation // BUG: Assertions comparing incompatible types should not be made

        // Those negative assertions are more likely to always pass
        assert spatula != plant; // Noncompliant; unrelated class and interface // BUG: Assertions comparing incompatible types should not be made
        assert tool != plant; // Noncompliant; unrelated interfaces // BUG: Assertions comparing incompatible types should not be made
    }
}