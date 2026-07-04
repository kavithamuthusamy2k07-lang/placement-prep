class Solution {
    public int subtractProductAndSum(int n) {
        int s1=1,s2=0;
        while(n>0){
            int digit=n%10;
            s1=s1*digit;
            s2=s2+digit;
            n/=10;

        }
        return s1-s2;

    }
}