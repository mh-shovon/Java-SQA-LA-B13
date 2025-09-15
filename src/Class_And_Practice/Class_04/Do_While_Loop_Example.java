package Class_And_Practice.Class_04;

class Do_While_Loop_Example {
    public static void main(String[] args) {
        System.out.println("Do-While Loop - Unlimited Count (Stopped with break):");
        int i = 1;
        do {
            System.out.println("i = " + i);
            if (i == 5) { // stop condition
                break;
            }
            i++;
        } while (true); // theoretically unlimited
    }
}
