public class App {
 
    public static void main(String[] args) {
         
        // 1D array
        int[] values = {3, 5, 2343};
         
        // Only need 1 index to access values.
        System.out.println(values[2]);
         
        // 2D array (grid or table)
        int[][] grid = {
            {3, 5, 2343},
            {2, 4},
            {1, 2, 3, 4}
        };
         
        // Need 2 indices to access values
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);
         
        // Can also create without initializing.
        String[][] texts = new String[2][3];
         
        texts[0][1] = "Hello there";
         
        System.out.println(texts[0][1]);
         
        // How to iterate through 2D arrays.
        // first iterate through rows, then for each row
        // go through the columns.
        for(int row=0; row < grid.length; row++) {
            for(int col=0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
             
            System.out.println();
        }
         
        // The last array index is optional.
        String[][] words = new String[2][];
         
        // Each sub-array is null.
        System.out.println(words[0]);
         
        // We can create the subarrays 'manually'.
        words[0] = new String[3];
         
        // Can set a values in the sub-array we
        // just created.
        words[0][1] = "hi there";
         
        System.out.println(words[0][1]);
    }
 
}