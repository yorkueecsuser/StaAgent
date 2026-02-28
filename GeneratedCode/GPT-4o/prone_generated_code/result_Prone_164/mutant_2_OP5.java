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

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable.");
                break;
            default:
                break;
        }
    }
    
    // This method simulates a dynamic condition, ensuring no compile-time constant is used
    private int getUnreachableValue() {
        // Returning a value that will never match the case in the switch statement
        return 0;
    }
    
    public static void main(String[] args) {
        TreeToStringExample example = new TreeToStringExample();
        Tree tree = new Tree("ExampleTree");
        System.out.println(example.showBug(tree)); // This demonstrates the bug
    }
}