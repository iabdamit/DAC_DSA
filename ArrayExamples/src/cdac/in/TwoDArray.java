package cdac.in;

public class TwoDArray {
    int arr[][]=null;
    
    // Construct
    public TwoDArray(int rows,int cols){
        arr=new int[rows][cols];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                arr[row][col] =Integer.MIN_VALUE;
            }
        }
    }
    //! inserting value in 2D Array
    public void insertValues(int row, int col,int value) {
        try {
            if (arr[row][col]==Integer.MIN_VALUE) {
                arr[row][col]=value;
            }
            else{
                System.out.println("cell already contains some value");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index values given");
        }
    }
    
    //! Display 2D Array
    public void display2DArray(){
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        for (int row = 0; row < arr.length; row++) {
            for (int col  = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    }
    //!
    public void cellData(int row,int col){
        System.out.println("Row#"+row+"Col#"+col);
        try {
            System.out.println("Cell value is ");
        } catch (Exception e) {
            
        }
    }

}
