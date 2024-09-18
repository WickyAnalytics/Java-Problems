/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author georg
 */
public class BinarysearchTree {
    Node root;

    public BinarysearchTree() {
        root = null;
    }

    Node findNode(int val) {
        Node temp = root;
        while (temp != null && temp.val != val) {
            if (val < temp.val)
                temp = temp.left;
            else
                temp = temp.right;
        }
        return temp;
    }

    boolean find(int val) {
        return findNode(val) != null;
    }

    // find parent method--------------------------------------------------------
    Node findParent(int key) {
        Node temp = root;
        Node parent = null;
        while (temp != null && temp.val != key) {
            parent = temp;
            if (key < temp.val)
                temp = temp.left;
            else
                temp = temp.right;
        }
        return parent;
    }

    void insert(int data) {
        Node temp = findNode(data);
        if (temp != null)
            return;
        Node myNode = new Node(data);
        Node myParent = findParent(data);

        if (myParent == null) {
            root = myNode;
            return;
        }

        if (data < myParent.val)
            myParent.left = temp;
        else
            myParent.right = temp;
    }

    boolean isLeaf(Node x) {
        return x.left == null && x.right == null;
    }

    boolean has_OneChild(Node x) {
        return (x.left == null && x.right != null) || (x.left != null && x.right == null);
    }

    // get max number method ---------------------------------------------------
    Node getMaxNum(Node myNode) {
        Node temp = myNode;
        while (temp != null)
            temp = temp.right;

        return temp;
    }

    // remove method for leaf and parent----------------------------------------
    int remove(int data) {
        int val;
        Node delete = findNode(data);
        Node parent = findParent(data);

        if (delete == null) {
            System.out.println(" Node Not Found");
            return -1;
        }
        if (isLeaf(delete)) {
            if (delete == root)
                root = null;
            else {
                if (parent.left == delete)
                    parent.left = null;
                else
                    parent.right = null;
            }
            val = delete.val;
        } else if (has_OneChild(delete)) {
            if (parent.right == delete) {
                if (delete.right != null)
                    parent.right = delete.right;
                else
                    parent.right = delete.left;
            } else {
                if (delete.right != null)
                    parent.left = delete.right;
                else
                    parent.left = delete.left;
            }
            data = delete.val;
        } else {
            Node highestLNode = getMaxNum(delete.left);
            data = remove(highestLNode.val);
            delete.val = data;
        }
        return data;
    }

    void print(int order) {
        switch (order) {
            case 1:
                System.out.println("Printing tree INORDER ");
                printInOrder(root);
                break;
            case 2:
                System.out.println("Printing tree PREORDER");
                printPreOrder(root);
                break;
            case 3:
                System.out.println("Printing tree POSTORDER ");
                printPostOrder(root);
                break;
            default:
                break;
        }

    }

    void printInOrder(Node temp) {
        if (temp == null)
            return;

        printInOrder(temp.left);
        System.out.println(temp.val);
        printInOrder(temp.right);
    }

    void printPreOrder(Node temp) {
        if (temp == null)
            return;

        System.out.println(temp.val);
        printPreOrder(temp.left);
        printPreOrder(temp.right);
    }

    void printPostOrder(Node temp) {
        if (temp == null)
            return;

        printPostOrder(temp.left);
        printPostOrder(temp.right);
        System.out.println(temp.val);
    }

    public void MaxNum() {
        Node temp = root;
        while (temp != null) {
            temp = temp.right;
        }
        System.out.println("the max number is=" + temp.val);
    }
}
