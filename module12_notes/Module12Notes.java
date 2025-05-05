public class Module12Notes {
    public static void main(String[] args) {
        // Algorithm efficiency
        // How  can you examine and analyze code so that it's
        // mathematically provable that one algorithm is better
        // or more efficient than another.

        // We're checking how much time does an alrorithm spend computing
        // things. Expressed as a function of how many data points
        // it's  processing.

        // ie 10 students with 10 items = 100 iterations
        // ie 1000 students with 10 items = 1,000,000 iterations

        // 2 lines of code in a while loop that runs
        // 10 times means that you've executed 20 lines of code.

        // O(n) = 4 lines + 2 lines * n = 2n + 4
        // 4 lines alwys run, 2 lines that depend on number of
        // items in the list.

        // an intractable algorithm is so inefficient that you
        // should only use it with a small number of iterations.

        // drop all but the dominant term
        // 10n^2 + 5n + 32 = n^2 + n + 1 = n^2

        

    }
}
