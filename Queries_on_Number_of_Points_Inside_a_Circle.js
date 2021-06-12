/**
 * @param {number[][]} points
 * @param {number[][]} queries
 * @return {number[]}
 */
var countPoints = function(points, queries) {
    const ans = [];
    for([x1, y1, r] of queries){
        let count = 0;
        for([x2,y2] of points){
            let d1 = (x1 - x2) ** 2 + (y1 - y2) ** 2;
            let r1 = r ** 2;
            if(d1 <= r1)
                count += 1;
        }
        ans.push(count);
    }
    return ans;
};