package AlgorithmAnalysis;

import java.util.Scanner;

public class ExecutionTimeMeasurement {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);


        String c = sc.nextLine();
        int numOfLoop = Integer.parseInt(sc.nextLine());*/

        int numOfLoop = 1600000;

        long startTime = System.currentTimeMillis(); // get timestamps
        /* algorithm */
        repeat1( "A", numOfLoop );
        // repeat2("A", numOfLoop);
        long endTime = System.currentTimeMillis(); // get timestamps

        long elapsedTime = endTime - startTime; // nanosecond

        System.out.println("Execution time: " + elapsedTime + " (ms).");
    }

    public static String repeat1(String c, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += c;
        }
        return answer;
    }

    public static String repeat2(String c, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append(c);
        }
        return answer.toString();
    }
}
