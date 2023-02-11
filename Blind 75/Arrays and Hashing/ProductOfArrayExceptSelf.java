import java.util.*;
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];

        // Initialise the first element as 1
        product[0] = 1;

        // Calculate for the rest of the elements as X[i-1] * product[i-1]
        // product[1] = X[0]
        // product[2] = X[0] * X[1]
        // product[3] = X[0] * X[1] * X[2]
        // ...
        for (int i = 1; i < product.length; i++) {
            product[i] = product[i-1] * nums[i-1];
        }

        // Initialise suffix product
        int suffixProduct = 1;

        // Multiply each element by the suffix product from the back so that it excludes the self element
        for (int i = nums.length - 1; i >= 0; i--) {
            product[i] = product[i] * suffixProduct;
            suffixProduct = suffixProduct * nums[i];
        }

        return product;
    }
}
