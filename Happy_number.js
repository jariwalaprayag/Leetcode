/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    var s1 = new Set();
    while(true){
        sum = 0;
        while(n > 0){
            sum += ((n % 10) ** 2);
            n = Math.floor(n / 10);
        }
        if(sum == 1)
            return true;
        if(s1.has(sum))
            return false;
        else
            s1.add(sum);
        n = sum;
    }
};