class GenericStack<T> {
    private Object[] data;
    private int top = -1;

    GenericStack(int capacity) {
        data = new Object[capacity];
    }

    public void push(T value) {
        if (top == data.length - 1) throw new RuntimeException("Stack overflow");
        data[++top] = value;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (top == -1) throw new RuntimeException("Stack underflow");
        return (T) data[top--];
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (top == -1) throw new RuntimeException("Stack underflow");
        return (T) data[top];
    }
}

public class GenericStackDemo {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>(3);
        stack.push(10);
        stack.push(20);
        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
    }
}
