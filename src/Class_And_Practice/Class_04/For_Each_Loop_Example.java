package Class_And_Practice.Class_04;

class For_Each_Loop_Example {
    public static void main(String[] args) {
        System.out.println("ForEach Loop - Iterating Array:");
        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) { // foreach
            System.out.println("Number: " + num);
        }
    }
}
