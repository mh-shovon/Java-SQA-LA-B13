package Class_And_Practice.Class_04;

class Break_Example {
    public static void main(String[] args) {
        System.out.println("Break Example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Loop stopped at i = " + i);
                break; // লুপ থামবে
            }
            System.out.println("i = " + i);
        }
    }
}
