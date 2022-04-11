import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Stopwatch {
    public static class StopWatch {
        private long startTime = 0;
        private long endTime = 0;
        private boolean running = false;

        public StopWatch() {
        }

        public void start() {
            startTime = System.currentTimeMillis();
            running = true;
        }

        public void stop() {
            endTime = System.currentTimeMillis();
            running = false;
        }

        public long getElapsedTime() {
            long elapsed;
            if (running) {
                elapsed = (System.currentTimeMillis() - startTime);
            } else {
                elapsed = ((endTime - startTime) / 1000);
            }
            return elapsed;
        }
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int mulai = 1;

        while (mulai == 1) {
            if (s.equals("S")) {
                sw.start();
                String q = input.nextLine();
                if (q.equals("Q")) {
                    sw.stop();
                    System.out.print(sw.getElapsedTime() + " detik");
                    mulai = 0;
                }
            } else {
                mulai = 0;
            }
        }
        input.close();
    }
}