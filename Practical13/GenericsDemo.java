class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}

class Pair<A, B> {
    A first;
    B second;
    Pair(A first, B second) { this.first = first; this.second = second; }
    public String toString() { return "(" + first + ", " + second + ")"; }
}

public class GenericsDemo {
    public static <T> T first(T[] array) {
        return array[0];
    }

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Hello");
        System.out.println(box.get());

        Pair<String, Integer> pair = new Pair<>("Age", 20);
        System.out.println(pair);

        Integer[] numbers = {10, 20, 30};
        System.out.println(first(numbers));
    }
}
