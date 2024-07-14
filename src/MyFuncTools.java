
import java.util.ArrayList;
import java.util.List;

public class MyFuncTools {

    public static <T> List<T> map(List<T> list, Actionable<T> funcLambda) {
        List<T> arrayList = new ArrayList<>();
        for (T element: list) {
            arrayList.add(funcLambda.act(element));
        }
        return arrayList;
    }

    public static <T> List<T> filter(List<T> list, FilterActionable<T> funcLambda) {
        List<T> arraylist = new ArrayList<>();
        for (T element: list) {
            if (funcLambda.act(element)) {
                arraylist.add(element);
            }
        }
        return arraylist;
    }
}
