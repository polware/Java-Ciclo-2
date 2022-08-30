/*You are given two arrays of integers a and b of the same length, and an integer k. We will be iterating through array a from left to right, and simultaneously through array b from right to left, and looking at pairs (x, y), where x is from a and y is from b. Such a pair is called tiny if the concatenation xy is strictly less than k.
Your task is to return the number of tiny pairs that you'll encounter during the simultaneous iteration through a and b.
 */

public class CodeChallenge2 {
    public static void main(String[] args) {    
        int[]a = {5, 2, 4, 6};
        int[]b = {1, 2, 3, 4};
        int k = 45;
        int result = solution(a, b, k);
        System.out.println(result);
    }

    static int solution(int[] a, int[] b, int k) {
        int x, y, xy, solution = 0;
        int size_a = a.length;
        int size_b = b.length;
        if(size_a == size_b){
            for(int c=0; c < size_a; c++){
                x = a[c];
                y = b[size_b - (c+1)];
                xy = Integer.parseInt(Integer.toString(x) + Integer.toString(y));
                System.out.println(xy);
                if (xy < k){
                    solution++;
                } 
            }
        }
        return solution;
    }    
}
