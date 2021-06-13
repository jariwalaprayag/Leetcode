class Solution:
    def pathInZigZagTree(self, label: int) -> List[int]:
        if label == 1:
            return [1]
        ans = []
        depth = int(math.log2(label))
        while(depth > 0):
            ans.append(label)
            parent = label // 2
            max_parent = 2 ** depth - 1
            min_parent = 2 ** (depth - 1)
            parent = max_parent - (parent - min_parent)
            label = parent
            depth -= 1
        ans.append(1)
        return ans[::-1]