package generic.ex1;

public class GenricBox<T>{

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}
