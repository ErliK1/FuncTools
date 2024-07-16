
@FunctionalInterface
public interface ReduceActionable<T> {
    
    public T action(T acc, T element);
    
}
