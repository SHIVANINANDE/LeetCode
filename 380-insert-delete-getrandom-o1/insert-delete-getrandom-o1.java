class RandomizedSet {
    ArrayList<Integer> list;
    HashMap<Integer, Integer> mpp;
    

    public RandomizedSet() {
        this.list=new ArrayList<>();
        this.mpp= new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(mpp.containsKey(val)){
            return false;
        }
        list.add(val);
        mpp.put(val, list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!mpp.containsKey(val)){
            return false;
        }
        int idx=mpp.get(val);
        mpp.put(list.get(list.size()-1),idx);
        int temp=list.get(idx);
        list.set(idx,list.get(list.size()-1));
        list.set(list.size()-1, temp);
        list.remove(list.size()-1);
        mpp.remove(val);
        return true;
        
    }
    
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */