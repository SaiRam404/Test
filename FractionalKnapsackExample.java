import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsackExample {
    public static void main(String[] args) {
        Item[] items = {
            new Item(60, 10),  
            new Item(100, 20),
            new Item(120, 30)
        };
        int capacity = 50;

        double maxValue = fractionalKnapsack(items, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }

    static class Item {
        double value, weight;
        Item(double v, double w) {
            value = v;
            weight = w;
        }
    }

    public static double fractionalKnapsack(Item[] items, int capacity) {
        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item i1, Item i2) {
                return Double.compare(i2.value / i2.weight, i1.value / i1.weight);
            }
        });

        double totalValue = 0;
        for (Item item : items) {
            if (capacity == 0) break;

            double take = Math.min(item.weight, capacity);
            totalValue += take * (item.value / item.weight);
            capacity -= take;
        }

        return totalValue;
    }
}
