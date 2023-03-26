import java.util.*;

/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #7
 * 20/03/2023
 * Clase que crea e instancia un arbol binario de busqueda
 * NOTA: El codigo utilizado en esta clase proviene del repositorio del profesor. Usuario: malonso-uvg/uvg2023ed40/02_ADT_Ejemplos
 */

public class BinarySearchTree<K extends Comparable<K>,V> implements IBinarySearchTree<K,V>{

	private TreeNode<K, V> root;

    public BinarySearchTree() {
        root = null;
    }

    public TreeNode<K, V> getRoot() {
        return root;
    }

    public void insert(K key, V value) {
		// Creamos el nuevo nodo
		TreeNode<K, V> newNode = new TreeNode<>(key, value);
		
		// Si el árbol está vacío, el nuevo nodo es la raíz
		if(root == null) {
			root = newNode;
			return;
		}
		
		// Buscamos la posición para insertar el nuevo nodo
		TreeNode<K, V> current = root;
		TreeNode<K, V> parent = null;
		while(current != null) {
			parent = current;
			if(key.compareTo(current.getKey()) < 0) {
				current = current.getLeft();
			} else if(key.compareTo(current.getKey()) > 0) {
				current = current.getRight();
			} else {
				// Si la llave ya existe, se actualiza el valor
				current.setValue(value);
				return;
			}
		}
		
		// Insertamos el nuevo nodo como hijo del nodo padre
		if(key.compareTo(parent.getKey()) < 0) {
			parent.setLeft(newNode);
			newNode.setParent(parent);
		} else {
			parent.setRight(newNode);
			newNode.setParent(parent);
		}
	}

    public TreeNode<K, V> find(K key) {
        TreeNode<K, V> currentNode = root;
        while (currentNode != null && key.compareTo(currentNode.getKey()) != 0) {
            if (key.compareTo(currentNode.getKey()) < 0) {
                currentNode = currentNode.getLeft();
            } else {
                currentNode = currentNode.getRight();
            }
        }
        return currentNode;
    }

	public void printTree() {
		printTree(root);
	}
	
	private void printTree(TreeNode<K,V> node) {
		if (node != null) {
			printTree(node.left);
			System.out.println(node.key + ": " + node.value);
			printTree(node.right);
		}
	}

}