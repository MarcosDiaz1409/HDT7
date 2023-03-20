import java.util.Comparator;

/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #7
 * 20/03/2023
 * Clase que crea e instancia un arbol binario de busqueda
 * NOTA: El codigo utilizado en esta clase proviene del repositorio del profesor. Usuario: malonso-uvg/uvg2023ed40/02_ADT_Ejemplos
 */

public class BinarySearchTree<K,V>{

    private TreeNode<K, V> root;
	private Comparator<K> keyComparator;
	private IBinarySearchTree<K, V> keyGenerator;
	private boolean isEmpty;
	private int count;

    public BinarySearchTree(Comparator<K> _keyComparator, IBinarySearchTree<K, V> _keyGenerator) {
		root = null;
		keyComparator = _keyComparator;
		keyGenerator = _keyGenerator;
		isEmpty = true;
		count = 0;
	}

    public void add(V value) {
		TreeNode<K, V> newNode = new TreeNode<K, V>((K)keyGenerator.getKeyFromValue(value), value);
		if (isEmpty) { //Es el primer elemento que se inserta
			root = newNode;
			isEmpty = false;
			count++;
		} else { //Ya hay elementos insertados
			internalInsert(root, newNode);
		}
	}

    public V search(K key) {
		return (V) internalSearch(root, key);
	}

    private V internalSearch(TreeNode<K, V> actual, K key) {
		
		if (actual != null) {
			
			int result = keyComparator.compare(actual.getKey(), key);
			
			// SI result es 0 entonces son iguales
			if (result == 0) {
				return actual.getValue();
			} else if (result > 0) {
				return (V) internalSearch(actual.getLeft(), key);
			}else {
				return (V) internalSearch(actual.getRight(), key);
			}
			
			
		} else {
			return null;
		}
		
		
	}

    public boolean isEmpty() {
		return isEmpty;
	}

    private void internalInsert(TreeNode<K, V> actualNode, TreeNode<K, V> newNode) {
		int result = keyComparator.compare(actualNode.getKey(), newNode.getKey());
		//si actual es mayor entonces da un nuemero posito
		//si actual es menor entonces da un numero negativo
		//si son iguales da 0
		
		if (result > 0) { //Inserto el nuevo a la izquierda porque es menor
			if (actualNode.getLeft() == null) { //La izquierda esta vacia
				actualNode.setLeft(newNode);
				newNode.setParent(actualNode);
				count++;
			} else { //Existe nodo en la izquierda entonces ahora nuevo se compara con este
				internalInsert(actualNode.getLeft() ,newNode);
			}
		} else if (result < 0) { //Inserto el nuevo a la derecha porque es mayor
			if (actualNode.getRight() == null) { //La derecha esta vacia
				actualNode.setRight(newNode);
				newNode.setParent(actualNode);
				count++;
			} else { //Existe nodo en la derecha entonces ahora nuevo se compara con la derecha
				internalInsert(actualNode.getRight() ,newNode);
			}
		}
	}

    public void InOrderTraversal(ITreeTraversal<K, V> visitador) {
		internalInOrder(root, visitador);
	}
	
	private void internalInOrder(TreeNode<K, V> actual, ITreeTraversal<K, V> visitador) {
		
		if (actual != null) {
			
			if (actual.getLeft() != null) {
				internalInOrder(actual.getLeft(), visitador);
			}
			
			visitador.visit(actual);
			
			if (actual.getRight() != null) {
				internalInOrder(actual.getRight(), visitador);
			}
			
		}
		
	}

}