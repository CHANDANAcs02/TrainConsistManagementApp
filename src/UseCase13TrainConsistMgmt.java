import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ==========================================================
 * MAIN CLASS - UseCase13TrainConsistMgmt
 * ==========================================================
 *
 * Use Case 13:
 * Performance Comparison (Loops vs Streams)
 *
 * Concepts:
 * - System.nanoTime()
 * - Loop Processing
 * - Stream Processing
 * - Performance Benchmarking
 */
public class UseCase13TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("==================================================\n");

        // Create a large collection of bogies
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("First Class", 24));
        }

        // Loop Benchmark
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie bogie : bogies) {
            if (bogie.getCapacity() > 60) {
                loopResult.add(bogie);
            }
        }

        long loopEnd = System.nanoTime();

        // Stream Benchmark
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();

        System.out.println("Loop Execution Time (ns): "
                + (loopEnd - loopStart));

        System.out.println("Stream Execution Time (ns): "
                + (streamEnd - streamStart));

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}