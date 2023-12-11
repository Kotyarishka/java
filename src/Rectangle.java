public class Rectangle implements Comparable<Rectangle> {
    private int sideA;
    private int sideB;
    private int area;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.area = sideA * sideB
    }

    @Override
    public int compareTo(Rectangle other) {
        if (this.area > other.area) {
            return 1;
        } else if (this.area < other.area) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.area + "";
    }
}
