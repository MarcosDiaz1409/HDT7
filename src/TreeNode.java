/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #7
 * 20/03/2023
 * Clase que instancia un nodo para el Binary Search Tree
 * NOTA: La idea para realizar esta clase fue tomada de ChatGPT
 */

public class TreeNode<K extends Comparable<K>,V1, V2>{

	K key;
	V1 value1;
	V2 value2;
	TreeNode<K, V1, V2> leftChild;
	TreeNode<K, V1, V2> rightChild;

	public TreeNode(K key, V1 value1, V2 value2) {
		this.key = key;
		this.value1 = value1;
		this.value2 = value2;
        leftChild = null;
        rightChild = null;
	}
	

}