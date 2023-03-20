/*
 * Marcos Diaz (221102)
 * Hoja de trabajo #7
 * 20/03/2023
 * Interface que contiene el metodo In-Order
 * NOTA: El codigo utilizado en esta clase proviene del repositorio del profesor. Usuario: malonso-uvg/uvg2023ed40/02_ADT_Ejemplos
 */

public interface ITreeTraversal<K,V> {

	void visit(TreeNode<K, V> actualNode);
	
}