/*
Zaimplementuj klasę Numbers. Dodaj konstruktor który przyjmuje trzy liczby typu integer.
Dodaj metody:
sum(), zwraca sumę liczb;
average(), zwraca średnią arytmetyczną liczb;
min(), zwraca najmniejszą z liczb;
max(), zwraca największą z liczb;
geometric(), zwraca średnią geometryczną liczb; Przetestuj zaimplementowany program.

Damian Kreft
*/


package Lab2.Zadanie5;

public class Numbers {
    private final int ARRAY_LENGTH = 3;
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sum() {
        return a + b + c;
    }

    public double average() {
        return (a + b + c) / 3;
    }

    public int min() {
        return sort()[0];
    }

    public int max() {
        return sort()[ARRAY_LENGTH - 1];
    }

    public double geometric() {
        return nthRoot(ARRAY_LENGTH, a * b * c);
    }

    public int[] sort() {
        int[] arr = { a, b, c };
        for (var i = 0; i < ARRAY_LENGTH - 1; i++) {
            for (var j = 0; j < ARRAY_LENGTH - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    var temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    private double nthRoot(double n, double value) {
        return Math.pow(value, 1/n);
    }
}
