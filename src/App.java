import java.util.*;

public class App {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(30);
        Integer[] arr1 = {5, 20, 30};
        Integer[] arr =  MyFuncTools.map(arr1, (element)-> {return element * 2;});
        System.out.println(Arrays.toString(arr));

        
    }
}
