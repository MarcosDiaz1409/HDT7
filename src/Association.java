import java.util.*;

public class Association<K extends Comparable<K>,V>{

    BinarySearchTree<K, Pair<K,V>> englishTree = new BinarySearchTree<>();

    public Association(){
        
    }

    public void buildBinarySearchTree(ArrayList<String> lines){
        
        for (String line : lines) {
            String[] parts = line.split(",");
            K key = (K) parts[0];
            K value1 = (K) parts[1];
            V value2 = (V) parts[2];
            englishTree.insert(key, new Pair<K,V>(value1, value2));
        }

        englishTree.printTree();
        
    }



    
}