package edu.course.lab01;

public class QuadreticEquation {
    public static void solve(String aStr, String bStr, String cStr) {

        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double c = Double.parseDouble(cStr);

        if (a == 0) {
            System.out.println("Ошибка: коэффицент 'а' не дложен быть равне нулю, так как уравнение не является квадратным.");
            return;
        }

        double d = b * b - 4 * a * c;

        if (d < 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Два вещественных корня: x1 = " + x1 + ", x2 = " + x2);

        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Один вещественный корень: x = " + x);

        } else {
            System.out.println("Вещественных корней нет");
        }
    }
}
