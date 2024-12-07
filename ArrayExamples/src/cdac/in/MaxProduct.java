package cdac.in;

public class MaxProduct {
    int product =1;
    int arr[]={20,10,30,50,40,60};
    
    public void addition(){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length; j++) {
                int currentProduct = arr[i] * arr[j];
                if (currentProduct > product) {
                    product = currentProduct;
                }
            } 
        }
        System.out.println("Max Product: " + product);
    }
    public static void main(String[] args) {
        MaxProduct mp=new MaxProduct();
        mp.addition();
    }
}