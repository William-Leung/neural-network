public class Test_Dialogue_System {

    /*Simple application of neural networks to demonstrate basic dialogue system*/

    public static void main(String[] args) {
        //entry point of application
        /*1. Initializes the neural network with an 'inputSize'.
          2. Creates array of layers with layer sizes.
          3. Creates network object with input size and array of layers.
          4. Uses Scanner class to create a dialogue with the user by taking their inputs
             a. Starts off conversation with a print statement outside of Scanner while loop.
             b. Takes user input, and encodes it, and saves encoded array
             c. Saves neural network output as 'intent' array
             d. Calls generateResponse() to get a String response and prints it out inside the Scanner loop.
            */
        
    }

    /*Encodes user input into suitable format for neural network.
     Adjust the length of the double array passed in to match (or be greater than) the size of the String input.
     (no implementation required beyond this)*/
    private static double[] encodeUserInput(String input) {
        double[] encoded = new double[10];
        return encoded;
    }



    /*Generates response based on neural network's output
     Determines the response by getting the index of highest value in the 'intent' array
     (representing the neural network's output). Create 3-4 String responses of your own to choose from as an output to return
     based on the highest index. Each response should be at least a single sentence that makes sense in the conversation context.*/
    private static String generateResponse(double[] intent) {
        return "";
    }


}
