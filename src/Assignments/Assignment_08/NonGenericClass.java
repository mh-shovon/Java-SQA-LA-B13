package Assignments.Assignment_08;

public class NonGenericClass {
    private Object data;   // Object type: can store anything

    public NonGenericClass(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
