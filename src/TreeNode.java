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
	TreeNode<K, V1, V2> left;
	TreeNode<K, V1, V2> right;

	public TreeNode(K key, V1 value1, V2 value2) {
		this.key = key;
		this.value1 = value1;
		this.value2 = value2;
        left = null;
        right = null;
	}

	public K getKey() {
		return this.key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V1 getValue1() {
		return this.value1;
	}

	public void setValue1(V1 value1) {
		this.value1 = value1;
	}

	public V2 getValue2() {
		return this.value2;
	}

	public void setValue2(V2 value2) {
		this.value2 = value2;
	}

	public TreeNode<K,V1,V2> getLeft() {
		return this.left;
	}

	public void setLeft(TreeNode<K,V1,V2> left) {
		this.left = left;
	}

	public TreeNode<K,V1,V2> getRight() {
		return this.right;
	}

	public void setRight(TreeNode<K,V1,V2> right) {
		this.right = right;
	}	

}