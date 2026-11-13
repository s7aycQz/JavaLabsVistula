package lab8;
//buble sort
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort {
    public static void main (String[] args){
        //int[] array={10,9,8,7,6,5,4,3,2,1};
        //int[] array={1,2,3,4,5,6,7,8,9,10};
        int[] array={1,2,3,6,4,5,7,8,9,10};
        int[] counter = {0};

        System.out.println("before:");
        System.out.println(Arrays.toString(array));

        boolean toSort= true;
        for(int j = 1; j < array.length && toSort; j++) {
            toSort=false;
            counter[0]++;
            for(int i = 0; i < array.length - j; i++) {
                counter[0]++;
                if(array[i] > array[i + 1]) {
                    counter[0]++;
                    int greater = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = greater;
                    toSort=true;
                }
            }

        }
        System.out.println("after:");
        System.out.println(Arrays.toString(array));
        System.out.println("number of actions:" +Arrays.toString(counter));
    }
}
