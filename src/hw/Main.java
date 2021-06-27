package hw;

public class Main {
    public static void main(String[] args) {
                int something;
                something = 7;
                char letter = 'A';
                float number = 2.28f;
                double numberTwo = 3.22;
                short xd = 3 + 22;
                byte qwe = 1;
                boolean zxc = xd < qwe;
                String text = "hello emae";
                long big = 123123123123L;

                System.out.println(zxc);

                System.out.println(math(3, 3, 3, 3));
                System.out.println(gates(16, 5));
                NumberInfo(23);
                System.out.println(NegNumber(-16));
                Hi("челик");
                IsYear(383);
            }
            // 3
            public static float math(float a, float b, float c, float d) {
                return a * (b + (c / d));
            }

            // 4
            public static boolean gates(int a, int b) {
                return (a + b >= 10) && (a + b <= 20);
            }

            // 5
            public static void NumberInfo(int n) {
                if (n >= 0) {
                    System.out.println("Положительное");
                } else {
                    System.out.println("Отрицательное");
                }
            }

            // 6
            public static boolean NegNumber(int n) {
                return n < 0;
            }
            // 7
            public static void Hi(String name) {
                System.out.println("Hello," + name + ", what's up?");
            }
            // 8
            public static void IsYear(int year) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("Високосный");
                }
                else {
                    System.out.println("Не високосный");
                }
            }
        }