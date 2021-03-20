package multiplegenerics;

public class IntegerPair implements Pair<Integer,Integer>{
    private Integer key;
    private Integer value;

    public IntegerPair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Integer getKey() {
        return key;
    }


    @Override
    public Integer getValue() {
        return value;
    }


}
