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
        // Adding an unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable block");
        }
        return tree.toString(); // BUG: TreeToString
    }
    
    // Method to provide a dynamic condition for unreachable code
    private boolean getUnreachableCondition() {
        return false; // This will always return false making the if block unreachable
    }
    
    public static void main(String[] args) {
        TreeToStringExample example = new TreeToStringExample();
        Tree tree = new Tree("ExampleTree");
        System.out.println(example.showBug(tree)); // This demonstrates the bug
    }
}