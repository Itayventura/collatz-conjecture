# collatz-conjecture

The algorithm validates that each number below 8528817511L is a collatz number.
8528817511L - not known, beacuse we reached out of bound exception.

# statement of the problem
Consider the following operation on an arbitrary positive integer:

If the number is even, divide it by two.
If the number is odd, triple it and add one.

Now form a sequence by performing this operation repeatedly, beginning with any positive integer, and taking the result at each step as the input at the next.
The Collatz conjecture is: This process will eventually reach the number 1, regardless of which positive integer is chosen initially.

# Correctness of the algorithm
as long we do not exceed out of bounds:
starting from 1 to 8528817511L, looping through all numbers,
we perform the above sequence.
instead of stoping at 1, we stop if we reached a number that we had already proved before that it is a collatz number.
i.e we proved that all numbers between 1 <= i <= n are collatz numbers, so in order to prove that n+1 is a collatz number it is suffice to show that by sequence of operations we can reach any number between 1 and n.


# run time
it takes less than a minute to complete 8 Billion numbers.
