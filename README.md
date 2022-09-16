# One In A Million

In this project we will practice using _conditional statements_ to create code
that can respond to user input and display different results based on the
choices of the user.

## Assignment

Your program should generate a random number between 0 and 1 million. Next, it
will prompt the user to enter a guess. If the user guesses the correct number,
the program will stop. Otherwise it will inform the user whether the guess was
_too high_ or _too low_. The user should be given twenty guesses. If the user
is able to guess correctly within those twenty guesses, the program stops and
informs the user that he has won. Otherwise, the program stops after twenty
guesses and declares victory.

In order to generate a properly random number, you will use the `Math.random()`
method included with java. `Math.random()` yields a `double` between 0 and 1,
including 0, but not 1. You will have to do some math to convert this to a
random number between 0 and 1 million. A helpful reminder that this code...

```java
double b = 7.9;
int a = (int) b;

System.out.println(a);
```

...prints "7". Java will not do rounding for you, it just _truncates_ a double
to cast it to an int.

### Scanners
This project will require you take user input from StdIn. This is best done using
the Java `Scanner` class. Here is an example of this being done:

```java
Scanner input = new Scanner(System.in);
int guess = 0;
if (input.hasNextInt()) {
  guess = input.nextInt():
}
```

If you would like more information on the Scanner class, [here are the javadocs](https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html)
and there is a simpler tutorial [here](https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html).
