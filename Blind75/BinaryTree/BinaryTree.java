package Blind75.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    TreeNode root;

    public BinaryTree () {
        this.root = null;
    };

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

    public void printInorder(TreeNode node) {
        if (node == null) {
            return;
        }

        printInorder(node.left);

        System.out.print(node.val + " ");

        printInorder(node.right);

    }

    public void printPreorder(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");

        printPreorder(node.left);

        printPreorder(node.right);
    }

    public void printPostorder(TreeNode node) {
        if (node == null) {
            return;
        }

        printPostorder(node.left);

        printPostorder(node.right);

        System.out.print(node.val + " ");
    }

    public void printLevelOrder(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(node);

        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            System.out.print(currentNode.val + " ");

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            } 

            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

}
