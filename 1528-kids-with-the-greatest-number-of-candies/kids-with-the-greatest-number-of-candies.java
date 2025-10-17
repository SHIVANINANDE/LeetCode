class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max=-1;
        for(int i=0; i<candies.length; i++){
            max=Math.max(max, candies[i]);
        }
        for(int i=0; i<candies.length; i++){
            int sum = candies[i]+extraCandies;
            if(sum>=max)list.add(true);
            else list.add(false);
        }
        return list;

    }
}