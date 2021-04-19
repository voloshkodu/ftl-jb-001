/** Найдите корень уравнения cos(x^5) + x^4 - 345.3*x - 23 = 0
 на отрезке [0; 10] с точностью по x не хуже, чем 0.001. Известно, что на этом промежутке корень единственный.
 Используйте для этого метод деления отрезка пополам (и рекурсию).
 **/

package com.company.tasks.task017;
public class Task017 {
    public static void run() {
        final double EPS = 0.001;
        double xn = 0, xk = 10, xd = 0;
        int n = 0;
        if (f(xn) == 0) {
            System.out.println(xn);
        } else if (f(xk) == 0) {
            System.out.println(xk);
        } else {
            while (Math.abs(xk - xn) >= EPS) {
                n++;
                xd = (xk + xn) / 2;
                if (f(xn) * f(xk) < 0) {
                    xk = xd;
                } else {
                    xn = xd;
                }
            }
        }

        System.out.println(f(xd));
        System.out.println(n);
    }

    private static double f (double x) {
        return Math.cos(Math.pow(x,5)) + Math.pow(x,4) - 345.3*x - 23;
    }
}
