package genericmethod;

import multiplegenerics.OrderedPair;
import multiplegenerics.Pair;

public class Main1 {
    public static void main(String[] args) {
        Pair<Integer,String> p1=new OrderedPair<Integer,String>(1,"unu");
        Pair<Integer,String> p2=new OrderedPair<Integer,String>(10,"zece");
        Pair<Integer,Integer> p3=new OrderedPair<>(10,30);

        System.out.println("p1 == p2 "+Util.compare(p1,p2));
        System.out.println("p1 == p2 "+Util.compare(p1,p1));
//        System.out.println("p1 == p2 "+Util.compare(p1,p3)); gresit din cauza ca noi am declarat in metoda compare p1 si p2 ca fiind Pair<K,V> in ambele cazuri

        System.out.println("p1 == p2 "+Util.comparePeSteroizi(p1,p3));

    }
}
