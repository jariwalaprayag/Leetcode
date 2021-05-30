class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones)
            que.add(i);
        
        while(que.size() > 1){
            int x = que.poll();
            int y = que.poll();
            if(x != y)
                que.add(Math.abs(x - y));
        }
        if(que.size() == 0)
            return 0;
        return que.poll();
    }
}