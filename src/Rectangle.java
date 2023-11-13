//Напишіть клас Rectangle, який описує прямокутник на площині.
//Конструктор об'єктів: Rectangle(int sideA, int sideB).
//Об'єкт має виводити інформацію про себе у виді площі прямокутника.
//Забезпечити упорядкування об'єктів за природнім порядком від меншого до

//більшого. Протестувати програму.

public class Rectangle implements Comparable<Rectangle> {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int compareTo(Rectangle other) {
        if (this.sideA * this.sideB > other.sideA * other.sideB) {
            return 1;
        } else if (this.sideA * this.sideB < other.sideA * other.sideB) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.sideA * this.sideB + "";
    }
}
