package genericdeclaration;

public class Box <E>{
    private E element;

    public E get() {
        return element;
    }

    public void set(E element) {
        this.element = element;
    }
}
