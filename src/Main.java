// ISD-22 Tischenko Danylo
// Sprint 2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<CalendarDate> datesList = new ArrayList<CalendarDate>();

        CalendarDate date1 = new CalendarDate(4, 23);
        CalendarDate date2 = new CalendarDate(4, 25);
        CalendarDate date3 = new CalendarDate(12, 1);
        CalendarDate date4 = new CalendarDate(5, 1);
        CalendarDate date5 = new CalendarDate(3, 1);
        CalendarDate date6 = new CalendarDate(9, 1);

        datesList.add(date1);
        datesList.add(date2);
        datesList.add(date3);
        datesList.add(date4);
        datesList.add(date5);
        datesList.add(date6);

        System.out.println("Before sorting:");
        for (CalendarDate date : datesList) {
            System.out.println(date);
        }

        System.out.println("\nAfter sorting:");
        Collections.sort(datesList);
        for (CalendarDate date : datesList) {
            System.out.println(date);
        }

        ArrayList<Rectangle> rectanglesList = new ArrayList<Rectangle>();

        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(4, 5);
        Rectangle rectangle3 = new Rectangle(1, 2);
        Rectangle rectangle4 = new Rectangle(3, 4);
        Rectangle rectangle5 = new Rectangle(5, 6);
        Rectangle rectangle6 = new Rectangle(6, 7);

        rectanglesList.add(rectangle1);
        rectanglesList.add(rectangle2);
        rectanglesList.add(rectangle3);
        rectanglesList.add(rectangle4);
        rectanglesList.add(rectangle5);
        rectanglesList.add(rectangle6);

        System.out.println("\nBefore sorting:");
        for (Rectangle rectangle : rectanglesList) {
            System.out.println(rectangle);
        }

        System.out.println("\nAfter sorting:");
        Collections.sort(rectanglesList);
        for (Rectangle rectangle : rectanglesList) {
            System.out.println(rectangle);
        }

    }
}
