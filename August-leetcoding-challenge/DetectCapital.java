class Solution {
    public boolean detectCapitalUse(String word) {
        boolean res = false;
        String auxUpper = word.toUpperCase();
        String auxLower = word.toLowerCase();
        if(word.equals(auxUpper)){
            res = true;
        }else if (word.equals(auxLower)){
            res=true;
        }else{
            char curr = word.charAt(0);
            String subWord = word.substring(1);
            String subAuxLower = word.substring(1).toLowerCase();
            if(Character.isUpperCase(curr) && subWord.equals(subAuxLower)){
                res = true;
            } 

        }
        return res;
    }
}
