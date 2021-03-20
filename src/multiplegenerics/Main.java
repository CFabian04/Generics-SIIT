package multiplegenerics;

import genericdeclaration.Box;

public class Main {
    public static void main(String[] args) {
        Pair<Integer,String>p1=new OrderedPair<Integer,String>(1,"unu");
        System.out.println(p1.getKey()+" "+p1.getValue());

        Pair<Integer,Integer> integerPair= new IntegerPair(1, 2);
        System.out.println(integerPair.getKey()+" "+integerPair.getValue());


        IntegerPair integerPair2= new IntegerPair(10,20);
        System.out.println(integerPair2.getKey()+" "+integerPair2.getValue());

        Pair<Double,Double> sameTypePair= new SameTypePair<>(10d,20d);
        System.out.println(sameTypePair.getKey()+" "+sameTypePair.getValue());

        Box <String> stringBox= new Box<>();
        stringBox.set("Interiorul cutiei");

        Pair<Integer, Box<String>>p4 = new OrderedPair<>(1,stringBox);
        p4.getValue().get();

        SameTypePair<Double> sameTypePair2= new SameTypePair<>(10d,20d);
        System.out.println(sameTypePair2.getKey()+" "+sameTypePair2.getValue());
    }
}
