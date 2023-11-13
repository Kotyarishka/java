public class CalendarDate implements Comparable<CalendarDate> {
    private int month;
    private int day;

    public CalendarDate(int month, int day) {
        this.month = month;
        this.day = day;
    }

    @Override
    public int compareTo(CalendarDate other) {
        if (this.month > other.month) {
            return 1;
        } else if (this.month < other.month) {
            return -1;
        } else {
            if (this.day > other.day) {
                return 1;
            } else if (this.day < other.day) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return month + "/" + day;
    }
}