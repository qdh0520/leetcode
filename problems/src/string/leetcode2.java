package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个数组 nums = [2, 7, 11, 15], target = 9,
 *因为 nums[0] + nums[1] = 2 + 7 = 9,
 *return [0, 1].
 *用了一个HashMap,这，利用map.containsKey
 *方法来搜索。
 * 复杂度变为了O（n）
 */
public class leetcode2 {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            //这里用了target - numbers[i]，如果map里有，就直接找到了两个答案
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                //通过Map的get方法得到标号,这里得到的是两个数中遍前面的数，因此给result[0]
                result[0] = map.get(target - numbers[i]);
                //返回正确结果
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
      int[] nums={2,7,11,15};
        leetcode2 leetcode2=new leetcode2();
       System.out.print(leetcode2.twoSum(nums,9)); //输出数组的地址
//        String intArrayString = Arrays.toString(leetcode2.twoSum(nums,9));
//        System.out.print(intArrayString); //输出数组的元素
    }
}
