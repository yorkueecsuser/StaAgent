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

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
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

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}