# knapsack-problem
Attempt at creating a solution in Java for the problem posed in this video [https://www.youtube.com/watch?v=hagBB17_hvg]

Based on the code from https://github.com/GavinLonDigital/ZeroOneKnapsackSolution/tree/main/.vs/ZeroOneKnapsackSolution

# Problem
We have x amount of goods weighing y kilos each.  We have a bag/box that can only hold x 

# Solution
We want to solve this problem with Dynamic Programming.  In the video, Gavin Lon details finding the solution by creating a 2d array and exploiting memoization

Memoization is the technique of optimizing our application by computing and storing the results we want in a "cache"[1].  In the case of the knapsack problem, Gavin Lon uses a 2D array to precompute and store the solution.  

Additionally, I also wanted to make this a command line interface.

Consider the 2D array as a graph, with an X and Y axis.  The X axis is the weight, the Y axis the cost, and we add the value downwards.

1. https://www.freecodecamp.org/news/memoization-in-javascript-and-react/#:~:text=In%20programming%2C%20memoization%20is%20an,instead%20of%20computing%20it%20again.
