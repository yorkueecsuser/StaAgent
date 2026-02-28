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
    
    // Method to generate a runtime condition
    private boolean getCondition() {
        // This condition always returns false
        return false;
    }
    
    // Mimicking a method that might use Tree#toString incorrectly
    public String showBug(Tree tree) {
        // Unreachable if statement introduced (mutation)
        if (getCondition()) {
            System.out.println("This code is unreachable and should not appear in output.");
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