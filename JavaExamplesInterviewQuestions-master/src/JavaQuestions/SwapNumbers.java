package JavaQuestions;

public class SwapNumbers {

	public static void main(String[] args) {
		
		
		// Declare and initialize two integer variables
        int a = 36, b = 46;

        // Print values before swapping
        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        /*
        // Swapping using a third variable 't'
        int t = a; // Store value of 'a' in 't'
        a = b;     // Assign value of 'b' to 'a'
        b = t;     // Assign value of 't' (original 'a') to 'b'
        */
        
        /*
        // Swapping without using a third variable
        a = a + b; // Step 1: a = 36 + 46 = 82
        b = a - b; // Step 2: b = 82 - 46 = 36
        a = a - b; // Step 3: a = 82 - 36 = 46
        */
        
        /*
        // Swapping without using a third variable (Multiplication & Division)
        a = a * b; // Step 1: a = 36 * 46 = 1656
        b = a / b; // Step 2: b = 1656 / 46 = 36
        a = a / b; // Step 3: a = 1656 / 36 = 46
        */
        
        b=a+b - (a=b);
        
        
        // Print values after swapping
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }

	}

