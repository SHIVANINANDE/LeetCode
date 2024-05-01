class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
       
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }
     public void fill(int[][] image, int sr, int sc, int newcolor, int oldClr) {
    
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || oldClr != image[sr][sc]) return;
        
        // if(oldClr != image[sr][sc]) return;
       
        image[sr][sc] = newcolor;
       
        fill(image, sr-1, sc, newcolor, oldClr);
        fill(image, sr+1, sc, newcolor, oldClr);
        fill(image, sr, sc-1, newcolor, oldClr);
        fill(image, sr, sc+1, newcolor, oldClr);
    }
}