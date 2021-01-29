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

8. A.
The code compiles and runs without issue, so options G and H are incorrect. First,
the Reindeer object is instantiated using the constructor that takes an int value. Since
there is no explicit call to the parent constructor, the default no-argument super()
is inserted as the first line of the constructor. The output is then Deer, followed by
Reindeer in the child constructor, so only options A and B can be correct. Next,
the method hasHorns() looks like an overridden method, but it is actually a hidden
method since it is declared private in the parent class. Because the hidden method is
referenced in the parent class, the parent version is used, so the code outputs false,
and option A is the correct answer.

9. B, C.
Only checked exceptions are required to be handled (caught) or declared. Runtime
exceptions are commonly thrown by both the JVM and programmer code.
Checked exceptions are usually thrown by programmer code. Errors are intended to be
thrown by the JVM. While a programmer could throw one, this would be a horrible
practice.

10. C, D, F.
Immediately after line 9, only Grasshopper g1 is eligible for garbage collection
since both one and two point to Grasshopper g2. Immediately after line 10, we still
only have Grasshopper g1 eligible for garbage collection. Reference one points to g1
and reference two is null. Immediately after line 11, both Grasshopper objects are eligible
for garbage collection since both one and two point to null. The code does compile.
Although it is traditional to declare instance variables early in the class, you don’t
have to.

11. B.
The code compiles and runs without issue; therefore, options E and F are incorrect.
This type of problem is best examined one loop iteration at a time:
■ On the first iteration of the outer loop i is 0, so the loop continues.
■ On the first iteration of the inner loop, i is updated to 1 and x to 6. The if-then
statement branch is not executed, and x is increased to 10 and j to 1.
■ On the second iteration of the inner loop (since j = 1 and 1 <= 2), i is updated
to 2 and x to 11. At this point, the if-then branch will evaluate to true for the
remainder of the program run, which causes the flow to break out of the inner
loop each time it is reached.
■ On the second iteration of the outer loop (since i = 2), i is updated to 3 and x to
12. As before, the inner loop is broken since x is still greater than 10.
■ On the third iteration of the outer loop, the outer loop is broken, as i is already
not less than 3. The most recent value of x, 12, is output, so the answer is option B.

12. B.
Line 10 calls the constructor on lines 3–5. That constructor calls the other constructor.
However, the constructor on lines 6–8 assigns the method parameter to itself,
which leaves the color instance variable on line 2 set to its default value of null.


13. C.
The code compiles and runs without issue, so options D and E are correct. Remember
that only one of the right-hand ternary expressions will be evaluated at runtime.
Since luck is not less than 10, the second expression, --luck, will be evaluated, and
since the pre-increment operator was used, the value returned will be 9, which is less
than 10. So the first if-then statement will be visited and Bear will be output. Notice
there is no else statement on line 6. Since luck is still less than 10, the second if-then
statement will also be reached and Shark will be output; therefore, the correct answer
is option C.

14. D, E, F.
The code compiles without issue, so options A and B are incorrect. If house
.getChickens() returns an array of one element, the code will output Cluck once, so
option D is correct. If house.getChickens() returns an array of multiple elements, the
code will output Cluck once for each element in the array, so option E is correct. Alternatively,
if house.getChickens() returns an array of zero elements, then the code will
throw an IndexOutOfBoundsException on the call to house.getChickens().get(0);
therefore, option C is not possible and option F is correct. The code will also throw an
exception if the array returned by house.getChickens() is null, so option F is possible
under multiple circumstances.

15. A, C, E.
The for-each loop automatically casts each Tadpole object to an Amphibian
reference, which does not require an explicit cast because Tadpole is a subclass of
Amphibian. From there, any parent class or interface that Amphibian inherits from is
permitted without an explicit cast. This includes CanSwim, the interface Amphibian
implements, and Object, which all classes extend from, so options A and E are correct.
Option C is also correct since the reference is being cast to the same type, so no explicit
cast is required. Option B is incorrect, since Long is not a parent of Amphibian. Option
D is incorrect as well, although an explicit cast to Tadpole on the right-hand side of the
expression would be required to allow the code to compile.

16. D, F, G.
The code does not compile, since a class cannot inherit two interfaces that
both define default methods with the same signature, unless the class implementing
the interfaces overrides it with an abstract or concrete method. Therefore, option A is
incorrect and options F and G are correct. The alternate approach is to make the
getName() method abstract in the interfaces, because an interface may inherit two
abstract methods with the same signature. The change must be made to both interfaces,
though, so options B and C are incorrect if taken individually, and option D is
correct since the changes are taken together.

17. A, C, F.
The only functional programming interface you need to memorize for the
exam is Predicate. It takes a single parameter and returns a boolean. Lambda expressions
with one parameter are allowed to omit the parentheses around the parameter
list, making options A and C correct. The return statement is optional when a single
statement is in the body, making option F correct. Option B is incorrect because a
return statement must be used if braces are included around the body. Options D and
E are incorrect because the type is Integer in the predicate and int in the lambda.
Autoboxing works for collections not inferring predicates. If these two were changed
to Integer, they would be correct.

18. B, D.
The new date APIs added in Java 8 use static methods rather than a constructor
to create a new date, making options E and F incorrect. The months are indexed starting
with 1 in these APIs, making options A and C incorrect. Option A uses the old
Calendar constants which are indexed from 0. Therefore, options B and D are correct.

19. C.
Files with the .java extension contain the Java source code and are compiled to
files with the .class extension that contain the bytecode.

20. A, C.
Option A is the exception base class, which is a checked exception. Options B,
D, and E extend RuntimeException directly or indirectly and therefore are unchecked
exceptions. Option F is a throwable and not an exception, and so should not be caught
or declared.

     */
}
