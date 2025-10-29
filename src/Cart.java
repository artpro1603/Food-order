public class Cart<T> {
    private T[] items;
    private int count; // скільки реально елементів додано

    public Cart() {
        items = (T[]) new Object[10]; // попередження компілятора ок
        count = 0;
    }

    public void addItem(T item) {
        if (count < items.length) {
            items[count] = item;
            count ++;
        }
        else {
            System.out.println("Cart is full!");
        }
    }

    public int getCount() {
        return count;
    }

    public String printCart(java.util.function.Function<T, String> formatter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(formatter.apply(items[i])).append("\n");
        }
        return sb.toString();
    }
}
