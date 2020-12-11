package OCA_SampleQuestions;

public class Answers {
    /*
1. E.
Option E is correct because local variables require assignment before referencing
them. Option D is incorrect because class and instance variables have default values
and allow referencing. a_b defaults to a null value. Options A, B, and C are incorrect
because identifiers may begin with a letter, underscore, or dollar sign. Options F and
G are incorrect because the code does not compile. If a_b was an instance variable, the
code would compile and output 0null.

2. C.
String literals are used from the string pool. This means that s1 and s2 refer to the
same object and are equal. Therefore, the first two print statements print true. The
third print statement prints false because toString() uses a method to compute the
value and it is not from the string pool. The final print statement again prints true
because equals() looks at the values of String objects.

3. C, D, E.
First, the method getTailLength() in the interface HasTail is assumed to be
public, since it is part of an interface. The implementation of the method on line 3 is
therefore an invalid override, as protected is a more restrictive access modifier than
public, so option C is correct. Next, the class Cougar implements an overloaded version
of getTailLength(), but since the declaration in the parent class Puma is invalid,
it needs to implement a public version of the method. Since it does not, the declaration
of Puma is invalid, so option D is correct. Option E is incorrect, since Puma is marked
abstract and cannot be instantiated. The overloaded method on line 11 is declared
correctly, so option F is not correct. Finally, as the code has multiple compiler errors,
options A, B, and G can be eliminated.

4. C.
The code compiles and runs without issue; therefore, option F is incorrect. This type
of problem is best examined one loop iteration at a time:
■ The loop continues as count loop expression evaluates to 0 < 3, which is true,
with y taking a new value of 1. The value of y is set to:
y = (1 + 2 * 1) % 3
= (1 + 2) % 3
= 3 % 3
= 0
■ The first case block is called and the value of x is then set to:
x = 3 - 1 = 2
■ The loop continues as count loop expression evaluates to 1 < 3, which is true,
with y taking a new value of 2. The value of y is set to:
y = (1 + 2 * 2) % 3
= (1 + 4) % 3
= 4 % 3
= 2
xl Introduction
■ The default block is called and the value of x is set to:
x = 2 - 1 = 1
■ The loop continues as the count loop expression evaluates to 2 < 3, which is true,
with y taking a new value of 3. The value of y is set to:
y = (1 + 2 * 3) % 3
= (1 + 6) % 3
= 7 % 3
= 1
■ The second case block is called and the value of x is then set to:
x = 1 + 5 = 6
■ The loop ends as the count loop expression evaluates to 3 < 3, with y also taking a
new value of 4. The most recent value of x, 6, is output, so the answer is option C.

5. D.
The code starts running and prints a and b on lines 13 and 15. Line 16 throws an
exception, which is caught on line 17. After line 18 prints c, the finally block is run
and d is printed. Then the try statement ends and e is printed on line 22.

6. B.
The code compiles successfully, so options D and E are incorrect. The value of a
cannot be changed by the addToInt method, no matter what the method does, because
only a copy of the variable is passed into the parameter x. Therefore, a does not change
and the output on line 9 is 15.

7. B.
The array is allowed to use an anonymous initializer because it is in the same line as
the declaration. The ArrayList uses the diamond operator allowed since Java 7. This
specifies the type matches the one on the left without having to re-type it. After adding
the two elements, list contains [6, 8]. We then replace the element at index 1 with 9,
resulting in [6, 9]. Finally, we remove the element at index 0, leaving [9]. Option C
is incorrect because arrays output something like that rather than an ArrayList.

     */
}
