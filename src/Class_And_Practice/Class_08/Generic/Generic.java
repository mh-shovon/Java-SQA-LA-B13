package Class_And_Practice.Class_08.Generic;

public class Generic<T> {
    //This is a generic class
    private T value;

    public Generic(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
