import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Integer[] initialData = {4, 50, 7, 55, 90, 30, 70};

        System.out.println("Initial Array:");
        System.out.println(Arrays.toString(initialData));
        System.out.println("------------------------------------");

        MaxHeap<Integer> heap = new MaxHeap<>(initialData);

        System.out.println("\nMax: " + heap.getMax());

        System.out.println("\nElements of Heap:");
        while (!heap.isEmpty()) {
            System.out.print(heap.removeMax() + " ");
        }
        System.out.println();
    }
}
