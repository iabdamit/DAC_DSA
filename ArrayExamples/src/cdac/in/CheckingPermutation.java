package cdac.in;

public class CheckingPermutation {
    int arr1[]= {2,1,3,5,4,6};
    int arr2[]= {1,3,2,4,6,5};
    
    public void permutation(){
        if ((sumArray(arr1)== sumArray(arr2) && productArray(arr1)==productArray(arr2))) {
            System.out.println("Array1 is a Permutation of Array2");
        }
        else{
            System.out.println("Array1 and Array2 are not Permutation");
        }
    }
    
    public int sumArray(int arr[]){
        int sum=0;
        for (int index = 0; index < arr.length; index++) {
            sum+=arr[index];
        }
        return sum;
    }
    public int productArray(int arr[]){
        int product=1;
        for (int index = 0; index < arr.length; index++) {
            product *=arr[index];
        }
        return product;
    }
    
    public static void main(String[] args) {
        CheckingPermutation ck =new CheckingPermutation();
        ck.permutation();
    }
}
