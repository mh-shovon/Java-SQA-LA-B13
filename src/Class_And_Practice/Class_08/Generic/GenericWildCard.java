package Class_And_Practice.Class_08.Generic;

public class GenericWildCard <T extends Number> {
    private T value;

    public GenericWildCard(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
