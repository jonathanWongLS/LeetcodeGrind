package Blind75.BinaryTree;

public class Main {
    public static void main(String[] args) {
        InvertBinaryTree solution1 = new InvertBinaryTree();

        int[] nodeValues1a = {4,2,7,1,3,6,9};
        int[] nodeValues1b = {2,1,3}; 
        BinaryTree tree1 = new BinaryTree(nodeValues1a);
        
        tree1.printInorder(tree1.root);
        System.out.println("");
        tree1.printPreorder(tree1.root);
        System.out.println("");
        tree1.printPostorder(tree1.root);
        System.out.println("");
        tree1.printLevelOrder(tree1.root);

        // new TreePrinter(tree1).print(System.out);
        // System.out.println('\n');

        // solution1.invertTree(tree1.root);
        
        // new TreePrinter(tree1).print(System.out);

    }
}
