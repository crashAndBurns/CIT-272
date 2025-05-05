import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // printHello(100);
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a number and I will find the Factorial: ");
        int n = stdin.nextInt();
        long result = factorial(n);
        System.out.println(result);
    }

    // Creates an endless loop because the 
    // function  keeps calling itself within itself
    // Eventually the program explodes with a stack overflow.
    // What IS a stack overflow?
    // Main Memory Uses a stack, like we talked about last week.
    // So the stack has to remember  a function context on the stack
    // that every program uses for function calls.
    // Stack is used for paramerters, auto variables, etc. It's where
    // execution context gets saved each time a new function gets called.
    // Heap is for dynamic variables.  Stack grows upwards and heap
    // grows downwards. Heap grows downwards when you use the "new"
    // keyword.  At some point the stack runs out of room and you won't
    // have room to push anything more onto the stack. The stack runs
    // out of room.

    // THis was an untamed recursive call becasue it didnt have a
    // base case. So we'll needed to add one.
    public static void printHello(int depth) {
        if (depth > 0) { // Base Case Check
            System.out.println("Hello World! Depth of: " + depth);
            printHello(depth-1);  // REcursive call with reduced parameter/value
        }        
    }

    // Recursion can be useful but it does causes probelems with
    // memory inflation. Recursion requires you to think differently
    // than in traditional programming. Recursion is like looping, but
    // needs to be tamed to be useful.

    // two things you need for recursion to be useful
    // 1. A Base Case:
    //      Loop termination variable, at what point will the recursion
    //      stop. (Under what condition)? When you reach the base case,
    //      don't make the  recursive call anymore.
    //      When not at the base case, do make the recursive call.
    //
    // 2. Redution modification:
    //      Need a variable or parameter  that is 
    //      reduced or modified in the direction
    //      of the base case. Usually it's the variable you're looking for
    //      in the base case. Usually we use reduction but not always.
    //      SOmetimes we're even looking for null.  Each time you make
    //      the function call you change the parameter towards the base
    //      case.
    //
    //      Note: You might make multiple  recursive calls in the same function.


    // n! = 1 * 2 * 3 * ... * n
    // 0! = 1
    // 1! = 1
    // 2! = 1 * 2 = 2
    // 3! = 1 * 2 * 3 = 6
    // 4! = 1 * 2 * 3 * 4 = 24
    // 5! = 1 * 2 * 3 * 4 * 5 = 120
    // 5! = 5 * 4!
    // n! = n * (n - 1)!

    // a factorial is easy to do with a loop, but it is also
    // a good problem for recursion

    public static long factorial(long n) {
        if (n == 0) {  // Base Case
            return(1);  // No  recursive call in the base case.
        } else {
            return (n * factorial(n - 1));
        }
    }
}
