class LCPSolution1 {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;

        for(int i=0; i<strs[0].length(); i++) {
            System.out.println(strs[0].charAt(i));
            char c = strs[0].charAt(i);
            for(int j=1; j<n; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }

    public static void main(String[] args) {
      System.out.println(
          new LCPSolution1().longestCommonPrefix(
//              new String[] {"flower","flow","flight"}
              new String[] {"dog", "racecar", "car"}
          )
      );
    }

}
