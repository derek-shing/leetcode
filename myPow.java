package leetcode;

class Solution {
    public double myPow(double x, int n) {
        return myPowTR(x, n, 1);
    }
    
    double myPowTR(double x, int n , double a) {
        if (n==0)
            return a;
        else if (n>0){
            return myPowTR(x, n-1, x*a);
        }
        else{
            return myPowTR(x,n+1,1/x*a);
        }
    }
};
