Так, звичайно. Ось базовий приклад обробки даних в Java:

```java
import java.util.*;

public class DataProcessing {
    private List<Integer> numbers;

    public DataProcessing() {
        this.numbers = new ArrayList<>();
    }
    
    public void addNumber(int number) {
        this.numbers.add(number);
    }

    public int getNumber(int index) {
        return this.numbers.get(index);
    }

    public int findMaximum() {
        return Collections.max(this.numbers);
    }

    public int findMinimum() {
        return Collections.min(this.numbers);
    }

    public double findAverage() {
        return this.numbers.stream().mapToInt(val -> val).average().orElse(0.0);
    }

    public int findSum() {
        return this.numbers.stream().mapToInt(val -> val).sum();
    }

    public long countNumbers() {
        return this.numbers.stream().count();
    }

    public void printNumbers() {
        this.numbers.forEach(System.out::println);
    }

    public static void main(String[] args) {
        DataProcessing dataProcessing = new DataProcessing();
        Random random = new Random();

        // Add 100 random numbers from 0 to 100 to the list
        for (int i = 0; i < 100; i++) {
            dataProcessing.addNumber(random.nextInt(100));
        }

        // Print the numbers
        System.out.println("Numbers in the list:");
        dataProcessing.printNumbers();

        // Print the maximum number
        System.out.println("Maximum number: " + dataProcessing.findMaximum());

        // Print the minimum number
        System.out.println("Minimum number: " + dataProcessing.findMinimum());

        // Print the average of the numbers
        System.out.println("Average: " + dataProcessing.findAverage());

        // Print the sum of the numbers
        System.out.println("Sum: " + dataProcessing.findSum());

        // Print the number of numbers
        System.out.println("Number of numbers: " + dataProcessing.countNumbers());
    }
}
```

Цей код створює клас `DataProcessing`, який містить список чисел. Він має методи для додавання чисел до списку, отримання числа за індексом, знаходження максимального та мінімального числа, визначення середнього значення, суми та кількості чисел, а також для друку всіх чисел. Метод `main` додає 100 випадкових чисел від 0 до 100 до списку та виводить інформацію про числа.
