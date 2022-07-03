import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int lengthOfLIS(int[] nums) {
    int nLen = nums.length;
    int[] dp = new int[nLen];
    int res = 0;
    for (int start = nLen - 1; start >= 0; start--) {
      dp[start] = 1;
      for (int end = start + 1; end < nLen; end++) {
        if (nums[end] > nums[start]) {
          dp[start] = Math.max(dp[start], 1 + dp[end]);
        }
      }
      res = Math.max(dp[start], res);
    }
    return res;
  }

  public int lengthOfLISBinarySearch(int[] nums) {
    List<Integer> seq = new ArrayList<>();
    for (int num : nums) {
      int sLen = seq.size();
      int insertIdx = BinarySearch(seq, 0, sLen -1,  num);
      if (insertIdx == sLen) {
        seq.add(num);
      } else {
        seq.set(insertIdx, num);
      }
    }
    return seq.size();
  }

  public int BinarySearch(List<Integer> seq, int start, int end, int target) {
    int left = start;
    int right = end;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (target == seq.get(mid)) {
        return mid;
      }
      if (target > seq.get(mid)) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return left;
  }
}
