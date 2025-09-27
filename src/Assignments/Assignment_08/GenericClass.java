package Assignments.Assignment_08;

class GenericClass<T> {
    private T data;   // T = type placeholder

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}