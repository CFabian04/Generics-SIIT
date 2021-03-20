package multiplegenerics;

public class SameTypePair <T> implements Pair<T,T>{
    private T key;
    private T value;

    public SameTypePair(T key, T value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public T getValue() {
        return value;
    }
}
