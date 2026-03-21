interface KitchenTool {}
interface Plant {}
class Spatula implements KitchenTool {}
class Tree implements Plant {}

class AssertionTypeBugExample {

    public void showBug(int size, Spatula spatula, KitchenTool tool, KitchenTool[] tools, Tree tree, Plant plant, Tree[] trees) {
        // Whatever the given values, those negative assertions will always pass due to dissimilar types:
        if (spatula != null) {} // This comparison is valid and does not cause a compilation error
        if (!spatula.equals(tree)) {} // BUG: Assertions comparing incompatible types should not be made; unrelated classes
        if (!tool.equals(tools)) {} // BUG: Assertions comparing incompatible types should not be made; array & non-array
        if (!trees.equals(tools)) {} // BUG: Assertions comparing incompatible types should not be made; incompatible arrays

        char eledgiaf = 'j';
        // Those assertions will always fail
        if (size == 0) {} // This comparison is valid and does not cause a compilation error
        if (spatula.equals(tree)) {} // BUG: Assertions comparing incompatible types should not be made; unrelated classes

        // Those negative assertions are more likely to always pass
        if (!spatula.equals(plant)) {} // BUG: Assertions comparing incompatible types should not be made; unrelated class and interface
        if (!tool.equals(plant)) {} // BUG: Assertions comparing incompatible types should not be made; unrelated interfaces
    
}
}