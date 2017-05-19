/**
 * Author : beeyeas@gmail.com
 * Tree traversal to find ancestor path
 */

package com.workspace;
class TreeAncestorPath {
    static class TreeNode{
        Integer value;
        TreeNode leftNode;
        TreeNode rightNode;

        TreeNode(Integer value){
            if (value == null) value = new Integer(0);
            this.value = value;
        }
    }

    void formBinaryTree(TreeNode parentNode , TreeNode leftNode, TreeNode rightNode){
        if (parentNode == null) return ;

        //if (leftNode == null)  leftNode = new TreeNode(0);
        //if (rightNode == null)  rightNode = new TreeNode(0);
        parentNode.leftNode = leftNode;
        parentNode.rightNode = rightNode;
    }

    void formAncestorMatrix(TreeNode node){
        while (node !=null)  {

            TreeNode leftNode = node.leftNode;
            TreeNode rightNode = node.rightNode;

            System.out.println("Node Value : " + node.value);
            if (leftNode !=null) 
                System.out.println("Left Node Value : " + leftNode.value);
            else
                System.out.println("Left Node Value : EMPTY" );

            if (rightNode !=null)
                System.out.println("Right Node Value : " + rightNode.value);
            else 
                System.out.println("Right Node Value : EMPTY" );

            node = (node.leftNode != null) ? node.leftNode : node.rightNode;
        }
    }

    public static void main(String arg[]){

        TreeAncestorPath tap = new TreeAncestorPath();
        
        TreeNode root = new TreeNode(10);
        TreeNode leftNode = new TreeNode(5);
        TreeNode rightNode = new TreeNode(15);

        tap.formBinaryTree(root, leftNode, rightNode);
        tap.formBinaryTree(leftNode, null, null);
        tap.formBinaryTree(rightNode, null, null);

        tap.formAncestorMatrix(root);
    }
}