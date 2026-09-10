package edu.course.lab01;

public class Main {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            printUsage();
            return;
        }

        String command = args[0];

        try {
            switch (command) {
                case "fizzbuzz":
                    if (args.length != 1) {
                        printUsage();
                        return;
                    }
                    FizzBuzz.run();
                    break;

                case "reverse":
                    if (args.length != 2) {
                        printUsage();
                        return;
                    }
                    TextTasks.reverse(args[1]);
                    break;

                case "quadratic":
                    if (args.length != 4) {
                        printUsage();
                        return;
                    }
                    QuadreticEquation.solve(args[1], args[2], args[3]);
                    break;

                case "series":
                    if (args.length != 1) {
                        printUsage();
                        return;
                    }
                    SeriesCalculator.calculate();
                    break;

                case "palindrome":
                    if (args.length != 2) {
                        printUsage();
                        return;
                    }
                    TextTasks.palindrome(args[1]);
                    break;

                default:
                    printUsage();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ошибка при выполнении команды: " + e.getMessage());
        }
    }

    private static void printUsage() {
        System.out.println("Использование программы:");
        System.out.println(" fizzbuzz");
        System.out.println(" reverse <строка>");
        System.out.println(" quadratic <a> <b> <c>");
        System.out.println(" series");
        System.out.println(" palindrome <строка>");
    }
}
