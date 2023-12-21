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


    /*Calculate output of neuron based on inputs. Contains sigmoid function.
        1. Initialize a sum and multiply the values (index-wise) of the inputs array for number of neurons to the weights array
        2. Increment sum every iteration and add bias to it at the end.
        3. Returns the output as a double.
     */
    }

    public double output(double[] inputs) {


        /*Transforms input to a value between 0 and 1, which is useful for binary classification*/
        private double sigmoid(double x) {

        }
    }


}
