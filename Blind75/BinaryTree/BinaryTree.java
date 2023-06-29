package Blind75.BinaryTree;

public class BinaryTree {
    TreeNode root;

    public BinaryTree (int[] nodeValues) {
        this.root = null;

        for (int nodeVal : nodeValues) {
            this.insert(this.root, nodeVal);
        }
    } 

    public void insert(TreeNode root, int nodeToInsert) {
        if (this.root == null) {
            this.root = new TreeNode(nodeToInsert);
        }
        else {
            TreeNode currentNode = this.root;
            while (currentNode != null) {
                if (nodeToInsert == currentNode.val) {
                    System.out.println("Node with same value found! Insert failed."); 
                    return;
                }
                
                if (nodeToInsert < currentNode.val) {
                    if (currentNode.left == null) {
                        currentNode.left = new TreeNode(nodeToInsert);
                        break;
                    }
                    else {
                        currentNode = currentNode.left;
                    }
                }
                else {
                    if (currentNode.right == null) {
                        currentNode.right = new TreeNode(nodeToInsert);
                        break;
                    }
                    else {
                        currentNode = currentNode.right;
                    }
                }
            }
        }
    }
}
