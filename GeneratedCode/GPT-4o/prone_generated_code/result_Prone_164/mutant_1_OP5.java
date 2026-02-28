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
        
        // Unreachable switch statement mutation
        int getUnreachableValue = getUnreachableSwitchValue();
        switch (getUnreachableValue) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            case 2:
                System.out.println("This case is also unreachable");
                break;
            default:
                System.out.println("Default case");
        }
    }
    
    private int getUnreachableSwitchValue() {
        return -1; // Always returns a value not matched by the switch cases
    }

    public static void main(String[] args) {
        TreeToStringExample example = new TreeToStringExample();
        Tree tree = new Tree("ExampleTree");
        System.out.println(example.showBug(tree)); // This demonstrates the bug
    }
}