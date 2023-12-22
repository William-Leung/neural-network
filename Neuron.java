public class Neuron {
    /*Represents single neuron in neural network*/

    private double[] weights;
    private double bias;


    /*Constructor to initialize neuron with specific number of inputs*/
    /*Purpose: Constructor initialize neuron with specific number of inputs.
        How it Works:
            1. Creates an array of weights, one for each input.
            2. Initializes each weight with a random value.
            3. Initializes the bias with a random value.
     */
    public Neuron(int inputCount) {
        weights = new double[inputCount];
        for(int i = 0; i < weights.length; i++) {
            weights[i] = Math.random();
        }
        bias = Math.random();
    }

    /*Calculate output of neuron based on inputs. Contains sigmoid function.
        1. Initialize a sum and multiply the values (index-wise) of the inputs array for number of neurons to the weights array
        2. Increment sum every iteration and add bias to it at the end.
        3. Returns the output as a double.
     */
    public double output(double[] inputs) {
        double sum = 0; 
        if(inputs.length != weights.length) {
            System.out.println("Error: Input and weight array must be the same length.");
            return -1;
        }
        for(int i = 0; i < inputs.length; i++) {
            sum += inputs[i] * weights[i];
        }
        return sum + bias;
    }

    /*Transforms input to a value between 0 and 1, which is useful for binary classification*/
    private double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x));
    }
}
