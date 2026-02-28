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
    
    // Method to determine if a branch should be executed
    private boolean getUnreachableCondition() {
        return false; // This ensures the branch is unreachable
    }

    // Mimicking a method that might use Tree#toString incorrectly
    public String showBug(Tree tree) {
        // Inserting an unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is also unreachable.");
        }
        
        // Using toString() directly, which is a bug in certain contexts
        return tree.toString(); // BUG: TreeToString
    }
    
    public static void main(String[] args) {
        TreeToStringExample example = new TreeToStringExample();
        Tree tree = new Tree("ExampleTree");
        System.out.println(example.showBug(tree)); // This demonstrates the bug
    }
}