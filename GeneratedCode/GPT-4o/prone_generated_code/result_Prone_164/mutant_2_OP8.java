import java.util.HashMap;
import java.util.Map;

class TreeToStringExample {
    
    // Simulating a simple Tree structure
    static class Tree {
        String name;
        
        Tree(String name) {
            this.name = name;
        }
        
        @Override
        public String toString() {
            return "Tree: " + name;
        }
    }
    
    // Mimicking a method that might use Tree#toString incorrectly
    public String showBug(Tree tree) {
        // Using toString() directly, which is a bug in certain contexts
        return tree.toString(); // BUG: TreeToString
    }
    
    // Mutant method with renaming
    public String showBugMutant(Tree t) {
        // Using toString() directly, which is a bug in certain contexts
        return t.toString(); // BUG: TreeToString
    }
    
    public static void main(String[] args) {
        TreeToStringExample example = new TreeToStringExample();
        Tree tree = new Tree("ExampleTree");
        System.out.println(example.showBug(tree)); // This demonstrates the bug
        
        // Demonstrating the mutant method
        System.out.println(example.showBugMutant(tree)); // This demonstrates the bug
    }
}