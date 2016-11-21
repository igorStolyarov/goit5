//package ua.com.goit.gojavafive.groupten.igorstolyarov.core.module03.offline.triangel;
//
//public class Triangle {
//
//    private double x, y;
//    private double x1, y1;
//    private double x2, y2;
//    private double square;
//
//
//    public Triangle(double x, double y, double x1, double y1, double x2, double y2) {
//        this.x = x;
//        this.y = y;
//        this.x1 = x1;
//        this.y1 = y1;
//        this.x2 = x2;
//        this.y2 = y2;
//
//    }
//
//    private double square() {
//        double line1 = calculateLine(x, y, x1, y1);
//        double line2 = calculateLine(x1, y1, x2, y2);
//        double line3 = calculateLine(x, y, x2, y2);
//
//        double perimetr = calculatePerimetr(line1, line2, line3);
//        double halfOfPerimetr = perimetr / 2;
//        double heronFormula = Math.sqrt(halfOfPerimetr * (halfOfPerimetr-line1) * halfOfPerimetr *
//                (halfOfPerimetr-line2)) * halfOfPerimetr * (halfOfPerimetr-line3);
//        return square;
//    }
//
//    private double calculatePerimetr(double line1, double line2, double line3) {
//        return line1 + line2 + line3;
//    }
//
//    private double calculateLine(double x, double y, double x1, double y1) {
//        return Math.sqrt(Math.pow(x-x1), 2) + Math.pow(y - y1));
//    }
//
//
//    public void print() {
//        System.out.println();
//    }
//
//
//}
