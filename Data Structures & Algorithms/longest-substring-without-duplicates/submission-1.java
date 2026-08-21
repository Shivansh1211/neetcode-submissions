class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int left=0;
        for(char ch:s.toCharArray())
        {
               while(set.contains(ch))
               {
                set.remove(s.charAt(left));
                left++;
               }
               set.add(ch);
               maxLen=Math.max(maxLen,set.size());

            }
             return maxLen;
        }
       
    }

