import java.util.*;

public class App {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(30);
        list = MyFuncTools.filter(list, (element) -> {return element > 10;});
        System.out.println(list.toString());
        
    }
}
