import java.util.Arrays;

class TreeToStringExample {
public String showBug(String [] inputArray){
    String result = Arrays.toString(inputArray);
    result = Arrays.toString(inputArray);
    TreeNode root = new TreeNode("root");
    root.addChild(new TreeNode("child1"));
    root.addChild(new TreeNode("child2"));
    String treeString = root.toString();
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
}