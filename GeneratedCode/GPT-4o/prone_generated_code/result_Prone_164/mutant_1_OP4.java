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
    
    public static void main(String[] args) {
        TreeToStringExample example = new TreeToStringExample();
        Tree tree = new Tree("ExampleTree");
        System.out.println(example.showBug(tree)); // This demonstrates the bug
        
        // Unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code will never run.");
        } else {
            System.out.println("Unreachable if-else statement has been inserted.");
        }
    }
    
    // Dummy method to prevent compile-time constant for the condition
    private static boolean getCondition() {
        return false;
    }
}