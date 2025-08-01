package start.build.logic;

public class loop {
    public static void main(String[] args) {

        System.out.println("=== FOR LOOP with i++ ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("Condition check passed: i < 5 (i = " + i + ")");
            System.out.println("Inside body, i = " + i);
            System.out.println("After body, increment (i++) will happen");
        }

        System.out.println("\n=== FOR LOOP with ++i ===");
        for (int i = 0; i < 5; ++i) {
            System.out.println("Condition check passed: i < 5 (i = " + i + ")");
            System.out.println("Inside body, i = " + i);
            System.out.println("After body, increment (++i) will happen");
        }

        System.out.println("\n=== WHILE LOOP ===");
        int i = 0;
        while (i < 5) {
            System.out.println("Condition check: i < 5 (i = " + i + ")");
            System.out.println("Inside body, i = " + i);
            i++;
            System.out.println("After body, i incremented to: " + i);
        }

        System.out.println("\n=== DO-WHILE LOOP ===");
        i = 0;
        do {
            System.out.println("Inside body, i = " + i);
            i++;
            System.out.println("After body, i incremented to: " + i);
        } while (i < 5);
    }
}
