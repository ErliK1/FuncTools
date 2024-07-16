
import java.lang.reflect.Array;
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

    public static <T> T reduce(List<T> list, T acc, ReduceActionable<T> funcLambda) {
        for (T element: list) {
            acc = funcLambda.action(acc, element);
        }
        return acc;
    }

    public static <T> T[] map(T[] list, Actionable<T> funcLambda) {
        T[] tempList = (T[]) Array.newInstance(list[0].getClass(), list.length);
        for (int i = 0; i < list.length; i++) {
            tempList[i] = funcLambda.act(list[i]);
        } 
        return tempList;
    }

}
