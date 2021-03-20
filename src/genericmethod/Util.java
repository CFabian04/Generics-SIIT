package genericmethod;

import multiplegenerics.Pair;

public class Util {
    public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V>p2) {
        return p1.getKey().equals(p2.getKey())&&p2.getValue().equals(p2.getValue());

    }
    public static <K1,V1,K2,V2> boolean comparePeSteroizi(Pair<K1,V1> p1, Pair<K2,V2>p2) {
        return p1.getKey().equals(p2.getKey())&&p2.getValue().equals(p2.getValue());

    }
}
