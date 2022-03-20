# Portals
House visiting

Alex is trapped in a mad scientist's house. The house has ‘N’ rooms numbered from 0 to ‘N’ - 1. All the rooms have one exit portal each. The portal is used to exit the room. The portal behaves in a peculiar way. If you have used the ith portal (including the current use) an odd number of times, you will reach the room named ‘dest[i]’ (0 <= dest[i] <= i). If you are using it an even number of times, you will reach room number i+1 (if it is the last room, you come back to room 0). Return the minimum number of times, you need to use the portal in order to visit each room at least once. Since, the answer can be large, output it modulo 10^9+7.
Example: Suppose dest = [0, 0]. On day 0, we are in room 0. We will be using the portal for the first time so it is odd. We then move to dest[0] on day 1. Then, on day 1, we will be using the portal a second time, which is even. So, on day 2, we move to the next house, which is room 1. So, it takes 2 days to visit each room once.
Input Format:
The first line contains ‘T’, denoting the number of test cases.

The first line of each test case contains two integers, ‘N’ denoting the number of houses.

The second line of each test case contains an array ‘dest’ containing ‘N’ space-separated integers.
Output Format:
For each test case, print a single integer, denoting the minimum number of days that are required to visit each room.
Note:
You are not required to print the expected output. It has already been taken care of. Just implement the function.
Constraints:
1 <= T <= 5
1 <= N <= 10^5
0 <= dest[i] <= i

Time Limit: 1 sec
Sample Input 1:
2
3
0 0 2
2
0 1 2 0
Sample Output 1:
6
6
Explanation For Sample Input 1:
In the first test case, dest =  [0, 0, 2]. If we carefully follow the path, we can see we follow the path: [0, 0, 1, 0, 0, 1, 2]. Hence, it takes six days to visit all rooms.
In the second test case, dest = [0, 1, 2, 0]. The path followed is [0, 0, 1, 1, 2, 2, 3]. So, it takes six days to visit all the rooms.
Sample Input 2:
2
4
0 1 0 1
4
0 1 1 3
Sample Output 2:
10
8
