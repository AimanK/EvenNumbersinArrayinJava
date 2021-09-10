class Main {
  public static void main(String[] args) {

    /*
    Leetcode question #1295 - Find Numbers with Even Number of Digits
    
    Given an array nums of integers, return how many of them contain an even number of digits.
    */

    /* 

    Leetcode results - 
    Runtime: 2 ms, faster than 25.32% of Java online submissions for Find Numbers with Even Number of Digits.

    Memory Usage: 40.4 MB, less than 19.10% of Java online submissions for Find Numbers with Even Number of Digits.
    
    */

    int[] nums = {12,141,161,13,151,6,17,21,46,3,19};


    int ans = findEven(nums);

    System.out.println("There are " + ans + " even numbers in the array given");


  }

  static int findEven(int[] nums)
  {
    int evenCount = 0;

    for (int index = 0; index < nums.length; index++)
    {
      if (digitCount(nums[index]) % 2 == 0)
      {
        evenCount++;
      }
    }
    return evenCount;
  }


  static int digitCount(int input)
  {
    int count = 0;

    while (input != 0)
    {
      input = input / 10;
      count++;
    }

    return count;
  }
}