package cdac.in;
public class RotateMatrix {
    int arr[][]={{1,2,3},
    {4,5,6},
    {7,8,9}};
    
    public void rotateMatrix(){
       // int arr1= rotate(arr);
    }
    
    public int rotate( int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int index = 0; index < arr.length; index++) {
                System.out.print(arr[index][i]+" ");
            }
            System.out.println();
        }
        return 0;
    }
    
    public void displayMatrix(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int index = 0; index < arr.length; index++) {
                
                System.out.print(arr[i][index]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RotateMatrix rm=new RotateMatrix();
        rm.rotateMatrix();
    }
}
