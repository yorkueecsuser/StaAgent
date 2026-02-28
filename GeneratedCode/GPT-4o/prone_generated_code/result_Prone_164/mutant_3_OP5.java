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
        
        // Inserted unreachable switch statement
        int unreachableSwitch = getUnreachableValue(); // dynamically determined value
        switch (unreachableSwitch) {
            case 999: // Unlikely case to be reached
                System.out.println("This switch case is unreachable.");
                break;
            default:
                break;
        }
    }
    
    // Method to provide a dynamic value for the switch statement
    private int getUnreachableValue() {
        return 0; // Ensures that the case 999 is never reached
    }
    
    public static void main(String[] args) {
        TreeToStringExample example = new TreeToStringExample();
        Tree tree = new Tree("ExampleTree");
        System.out.println(example.showBug(tree)); // This demonstrates the bug
    }
}