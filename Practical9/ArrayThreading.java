class ArrayThread extends Thread {
    int[] arr;
    int start, end;
    static int total = 0;

    ArrayThread(int[] arr, int start, int end) {
        this.arr = arr; this.start = start; this.end = end;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            total += arr[i];
        }
    }
}

public class ArrayThreading {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[10000];
        for (int i = 0; i < numbers.length; i++) numbers[i] = 1;

        ArrayThread t1 = new ArrayThread(numbers, 0, 2500);
        ArrayThread t2 = new ArrayThread(numbers, 2500, 5000);
        ArrayThread t3 = new ArrayThread(numbers, 5000, 7500);
        ArrayThread t4 = new ArrayThread(numbers, 7500, 10000);

        long start = System.nanoTime();
        t1.start(); t2.start(); t3.start(); t4.start();
        t1.join(); t2.join(); t3.join(); t4.join();
        long end = System.nanoTime();

        System.out.println("Expected sum: 10000");
        System.out.println("Actual sum: " + ArrayThread.total);
        System.out.println("Time taken: " + (end - start) + " ns");
    }
}
