import java.util.Arrays;

class TreeToStringExample {

    public String showBug(String[] inputArray) {
        // Convert array to string using Arrays.toString which internally uses Object.toString for elements
        // This is not directly related to Tree#toString but serves to demonstrate the concept of using toString() inappropriately
        String result = Arrays.toString(inputArray); // This is not the bug, just setup
        
        // Simulate a tree structure using a simple class
        TreeNode root = new TreeNode("root");
        root.addChild(new TreeNode("child1"));
        root.addChild(new TreeNode("child2"));
        
        // Bug: Using Tree#toString which discards whitespace and comments
        String treeString = root.toString(); // BUG: TreeToString

        // Mutant: Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block due to mutant.");
        }

        return treeString;
    }

    private static class TreeNode {
        private String name;
        private TreeNode[] children;

        public TreeNode(String name) {
            this.name = name;
            this.children = new TreeNode[0];
        }

        public void addChild(TreeNode child) {
            this.children = Arrays.copyOf(this.children, this.children.length + 1);
            this.children[this.children.length - 1] = child;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(name).append(": [");
            for (int i = 0; i < children.length; i++) {
                sb.append(children[i].name);
                if (i < children.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        TreeToStringExample example = new TreeToStringExample();
        System.out.println(example.showBug(new String[]{"element1", "element2"}));
    }

    // Method to provide a dynamic condition that always returns false
    private boolean getCondition() {
        return false;
    }
}