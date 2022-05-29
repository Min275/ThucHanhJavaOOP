import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

public class App105 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        treeMap.put(1, 'a');
        treeMap.put(2, 'b');
        treeMap.put(3, 'c');
        treeMap.put(4, 'd');
        treeMap.put(5, 'e');
        treeMap.put(6, 'f');

        Set<Entry<Integer, Character>> settreemap = treeMap.entrySet();
        System.out.println(" CÁc entry có trong settreemap:");
        System.out.println(settreemap);

    }
}