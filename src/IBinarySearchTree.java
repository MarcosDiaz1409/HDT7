/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #7
 * 20/03/2023
 * Interface que contiene los metodos que usara el arbol binario
 * NOTA: La idea del codigo fue tomada de ChatGPT
 */

public interface IBinarySearchTree<K extends Comparable<K>,V>{

    void insert(K id, V value);

    TreeNode<K, V> find(K id);

}