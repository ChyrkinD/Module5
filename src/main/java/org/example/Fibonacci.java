package org.example;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    Map<Long,Long> hashMap = new HashMap<>();

    /**
     * Просторова складність: O(1)
     * Часова складність: O(n)
     */

    public long iterative(long n) {
        if(n == 0 ){
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }
        long result = 0;
        long number1 = 1;
        long number2 = 1;
        for(int i = 2; i < n; i++){
            result = number1 + number2;
            number1 = number2;
            number2 = result;
        }
        return result;
    }

    /**
     * Просторова складність: O(n)
     * Часова складність:  O(2^n)
     */
    public long recursive(long n) {
        if(n == 0 ){
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return recursive(n-1) + recursive(n-2);
    }

    /**
     * Просторова складність: O(n)
     * Часова складність: O(n)
     */
    public long functional(long n) {
        if(n <= 1 ){
            return n;
        }

        if(hashMap.containsKey(n)){
            return hashMap.get(n);
        }

        long result = functional(n-1) + functional(n-2);
        hashMap.put(n,result);
        return result;
    }
}
