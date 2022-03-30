//printing the leaf nodes of a binary tree
public class LeafNodes {
    public static class TreeNode
    {
        char data;
        TreeNode left;
        TreeNode right;
        TreeNode(char data)
        {
            this.data=data;
        }
    }
    //Traversing and printing leaf nodes of binary tree
    public static void printLeafNodes(TreeNode node) {
        if(node==null)
            return;
        if(node.left == null && node.right == null) {
            System.out.printf("%c ",node.data);
        }
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }
    public static void main(String[] args){
        TreeNode rootNode=createBinaryTree();
        System.out.println("Leaf nodes in binary tree are:");
        printLeafNodes(rootNode);
    }
    // Creating a binary tree
    public static TreeNode createBinaryTree()
    {
        TreeNode rootNode =new TreeNode('A');
        TreeNode nodeB=new TreeNode('B');
        TreeNode nodeC=new TreeNode('C');
        TreeNode nodeE=new TreeNode('E');
        TreeNode nodeF=new TreeNode('F');
        TreeNode nodeG=new TreeNode('G');
        TreeNode nodeH=new TreeNode('H');
        TreeNode nodeD=new TreeNode('D');
        TreeNode nodeK=new TreeNode('K');
        rootNode.left=nodeB;
        rootNode.right=nodeF;
        nodeB.left=nodeC;
        nodeB.right=nodeE;
        nodeF.left=nodeG;
        nodeF.right=nodeH;
        nodeC.left=nodeD;
        nodeH.right=nodeK;
        return rootNode;
    }
}