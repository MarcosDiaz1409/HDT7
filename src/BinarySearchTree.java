import java.util.*;

/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #7
 * 20/03/2023
 * Clase que crea e instancia un arbol binario de busqueda
 * NOTA: La idea para realizar esta clase fue tomada de ChatGPT
 */

public class BinarySearchTree<K extends Comparable<K>, V1, V2>{

	private TreeNode<K, V1, V2> root;

    public void insert(K key, V1 value1, V2 value2) {
        TreeNode<K, V1, V2> newNode = new TreeNode<>(key, value1, value2);
        if (root == null) {
            root = newNode;
        } else {
            TreeNode<K, V1, V2> current = root;
            TreeNode<K, V1, V2> parent;
            while (true) {
                parent = current;
                if (key.compareTo(current.key) < 0) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

	public TreeNode<K, V1, V2> search(K key) {
        TreeNode<K, V1, V2> current = root;
        while (current != null && !current.key.equals(key)) {
            if (key.compareTo(current.key) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return current;
    }

    public void printInOrder() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode<K, V1, V2> node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.key + ": " + node.value1 + ", " + node.value2);
            inOrderTraversal(node.right);
        }
    }

    

}