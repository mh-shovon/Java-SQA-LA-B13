package Class_And_Practice.Class_04;

class Continue_Example {
    public static void main(String[] args) {
        System.out.println("Continue Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipped i = " + i);
                continue; // এই iteration skip হবে
            }
            System.out.println("i = " + i);
        }
    }
}
