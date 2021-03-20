package genericmethod;

import genericdeclaration.Box;

import java.util.List;

public class BoxListUtil {
    public static <U> void addToBoxList(List<Box<U>> boxes, U elem){
        Box<U>box = new Box<>();
        box.set(elem);
        boxes.add(box);
    }
    public static <U> void print(List<Box<U>>boxes){
        int counter=0;
        for(Box<U> box:boxes){
            U boxContent= box.get();
            System.out.println("Box #"+ counter++ +"contains [ "+ boxContent+ "] ");
        }
    }
}
