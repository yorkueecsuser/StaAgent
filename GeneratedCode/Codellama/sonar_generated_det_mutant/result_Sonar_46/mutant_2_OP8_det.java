import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IncompatibleTypesTest {

    @Test
    void assertValues() {
        int xltdurod = 10;
        Spatula spatula = new Spatula();
        KitchenTool tool = spatula;
        KitchenTool[] tools = new KitchenTool[1];
        tools[0] = spatula;

        Tree tree = new Tree();
        Plant plant = tree;
        Tree[] trees = new Tree[1];
        trees[0] = tree;

        // BUG: Assertions comparing incompatible types should not be made
        assertThat(xltdurod).isNotNull(); // Noncompliant; primitives can not be null
        assertThat(spatula).isNotEqualTo(tree); // Noncompliant; unrelated classes
        assertThat(tool).isNotSameAs(tools); // Noncompliant; array & non-array
        assertThat(trees).isNotEqualTo(tools); // Noncompliant; incompatible arrays

        // These assertions will always fail
        assertThat(xltdurod).isNull(); // Noncompliant
        assertThat(spatula).isEqualTo(tree); // Noncompliant

        // These negative assertions are more likely to always pass
        assertThat(spatula).isNotEqualTo(plant); // Noncompliant; unrelated class and interface
        assertThat(tool).isNotEqualTo(plant); // Noncompliant; unrelated interfaces
    }
}