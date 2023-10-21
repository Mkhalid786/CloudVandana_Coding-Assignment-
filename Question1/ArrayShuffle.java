import java.util.ArrayList;
import java.util.Collections;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int value : originalArray) {
            arrayList.add(value);
        }
        
        Collections.shuffle(arrayList);
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = arrayList.get(i);
        }
        
        
        for (int value : originalArray) {
            System.out.print(value + " ");
        }
    }
}
