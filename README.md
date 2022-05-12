# collatz-conjecture

## Statement of the problem
Consider the following operation on an arbitrary positive integer:

If the number is even, divide it by two.

If the number is odd, triple it and add one.

Now form a sequence by performing this operation repeatedly, beginning with any positive integer, and taking the result at each step as the input at the next.

The Collatz conjecture is: This process will eventually reach the number 1, regardless of which positive integer is chosen initially.

# Correctness of the algorithm
as long as we do not exceed out of bounds:
starting from 1 to any number, currently hard coded till 20 Billion, looping through all numbers,
we perform the above sequence.

instead of stopping at 1, we stop if we reached a number that we had already proved before that it is a collatz number.

i.e if we proved that all numbers between 1 <= i <= n are collatz numbers, so in order to prove that n+1 is a collatz number it is enough to show that by sequence of operations we can reach any number between 1 and n.


# Run time
it takes around 5 minutes to complete 20 Billion numbers.

# Output
we print every 16777216 numbers.

we print every number that is calculated with big integer due to the limit of long.
