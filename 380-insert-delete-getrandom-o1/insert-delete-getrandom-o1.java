class RandomizedSet {

   private Map<Integer, Integer> valueToIndexMap;
    private List<Integer> values;
    private Random randomNum;

    public RandomizedSet() { // --------------------------------/
        valueToIndexMap = new HashMap<>(); //O(1) average time  /
        values = new ArrayList<>(); //O(1) average time         / -- O(1)
        randomNum = new Random(); //O(1) average time                /
    } //--------------------------------------------------------/
    
    public boolean insert(int val) { //---------------------------/
        if (valueToIndexMap.containsKey(val)) { //O(1) Average    /
            return false;                                        //
        }                                                        // -- O(1) 
        valueToIndexMap.put(val, values.size()); //O(1) Average   /
        values.add(val); //O(1) Average                           /
        return true;                                             // 
    } //----------------------------------------------------------/
    
    public boolean remove(int val) { // ----------------------------/
        if (!valueToIndexMap.containsKey(val)) { //O(1) Average     /
            return false;                                          //
        }                                                          //
        int index = valueToIndexMap.get(val);  //O(1) Average       /                   
        int lastElement = values.get(values.size() - 1);//O(1) Avg  /
                                                                   //
        values.set(index, lastElement);   //O(1) Average            /
        // Move the last element to the 'deleted' position          /  --- O(1) 
        valueToIndexMap.put(lastElement, index); //O(1) Average     /
        // Update the index of the last element in the map          /
                                                                   //             
        values.remove(values.size() - 1); //O(1) Average            / 
        // Remove the last element                                  /
        valueToIndexMap.remove(val);  //O(1) Average                /
        // Remove the deleted element from map                      /   
        return true;                                               //
    } //------------------------------------------------------------/
    
    public int getRandom() { //---------------------------------------/
        int randomIndex = randomNum.nextInt(values.size()); //O(1) Average /
        return values.get(randomIndex);//O(1) Average


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
    }
}