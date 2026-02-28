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
    
    // Method to simulate a condition that returns false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        TreeToStringExample example = new TreeToStringExample();
        Tree tree = new Tree("ExampleTree");
        
        // Demonstrates the bug
        System.out.println(example.showBug(tree));

        // Inserted unreachable if-else branch
        boolean condition = example.getFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is always executed.");
        }
    }
}