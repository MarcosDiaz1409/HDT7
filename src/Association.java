import java.util.*;

public class Association<K extends Comparable<K>, V1, V2>{

    private BinarySearchTree<K, V1, V2> englishTree;
    private BinarySearchTree<K, V1, V2> spanishTree;
    private BinarySearchTree<K, V1, V2> frenchTree;

    public Association() {
        englishTree = new BinarySearchTree<>();
        spanishTree = new BinarySearchTree<>();
        frenchTree = new BinarySearchTree<>();
    }

    public void createEnglishTree(ArrayList<String> lines) {
        for (String line : lines) {
            String[] parts = line.split(",");
            K key = (K) parts[0];
            V1 value1 = (V1) parts[1];
            V2 value2 = (V2) parts[2];
            englishTree.insert(key, value1, value2);
        }

        englishTree.printInOrder();
    }

    public void createSpanishTree(ArrayList<String> lines) {
        for (String line : lines) {
            String[] parts = line.split(",");
            K key = (K) parts[1];
            V1 value1 = (V1) parts[0];
            V2 value2 = (V2) parts[2];
            spanishTree.insert(key, value1, value2);
        }

        spanishTree.printInOrder();
    }

    public void createFrenchTree(ArrayList<String> lines) {
        for (String line : lines) {
            String[] parts = line.split(",");
            K key = (K) parts[2];
            V1 value1 = (V1) parts[0];
            V2 value2 = (V2) parts[1];
            frenchTree.insert(key, value1, value2);
        }

        frenchTree.printInOrder();
    }    
}