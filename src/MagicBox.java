import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox(int arr) {
        this.items = (T[]) new Object[arr];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public void pick() throws RuntimeException {
        int lengt = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                lengt++;
            }
        }
        if (lengt > 0) {
            throw new RuntimeException("Осталось ячеек " + (items.length - lengt));
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        System.out.println(items[randomInt]);
    }
}
