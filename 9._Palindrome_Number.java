class Solution {
    public boolean isPalindrome(int x) {

        int Ogx = x;
        int numberReverse = 0;

        if(x == 0) {
            return true;
        }

        if(x < 0 ) {
            return false;
        }

        if(x % 10 == 0) {
            return false;
        }

        while(x > 0) {
            int lastdigit = x % 10;
             numberReverse = numberReverse * 10 + lastdigit;
            x = x / 10;
           
        }
         return numberReverse == Ogx;
    }
    
}
