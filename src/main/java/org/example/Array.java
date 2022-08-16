package org.example;

public class Array implements  IMath, ISort {
    int[] numbers;
    int amount = 0;

    public Array(int[] numbers) {
        this.amount = numbers.length;
        this.numbers = new int[amount];
        for (int i=0; i<amount; i++) this.numbers[i] = numbers[i];
    }
    public void Show() {
        System.out.print("[ ");
        for (int i : numbers) System.out.print(i + " ");
        System.out.println("]");
    }
    @Override
    public int Max() {
        int max = 0;
        for (int i : numbers)
            if (i > max) max = i;
        return max;
    }
    @Override
    public int Min() {
        int min = (int)Double.POSITIVE_INFINITY;
        for (int i : numbers)
            if (i < min) min = i;
        return min;
    }
    @Override
    public float AVG() {
        int sum=0;
        for (int i : numbers) sum +=i;
        return sum / amount;
    }
    @Override
    public void SortAsc() {
        for(int i = amount-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++)
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
        }
    }
    @Override
    public void SortDesc() {
        for(int i = amount-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++)
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
        }
    }
}
