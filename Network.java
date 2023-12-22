public class Network {

    //represents entire neural net, consisting of mult. layers
    /*Constructor to create neural network with specified layers*/
    private Layer[] layers;


    /*Purpose: Constructor initializes neural network with specific number of inputs.
    How it Works:
     1. Initializes array of layers with length of layerSizes array passed from
        the "SimpleDialogueSystem" class in the main method.
     2. Iterates through the above array. During this:
         a. We set an int variable 'prevLayerSize' every iteration to set the size of the previous layer.
            For the first layer (i = 0), we set the variable to the inputSize. Otherwise, the variable is set to the size of the previous layer in the layerSizes array.
         b. Set the value at each index to a newly created Layer object with the current layer size and 'prevLayerSize'.
     */
    public Network(int inputSize, int[] layerSizes) {
        layers = new Layer[layerSizes.length];
        for(int i = 0; i < layers.length; i++) {
            int prevLayerSize = i == 0 ? inputSize : layerSizes[i - 1];
            layers[i] = new Layer(layerSizes[i], prevLayerSize);
        }
    }

    /*calculates output of network
    * 1. Create array that stores the double[] inputs array
    * 2. Iterate through layers array created above, and set each value of the array by calling the output() function for the
    * current layer on each respective input value. We are calculating the output of each layer, but only returning the output of the final one.
    * 3. Return the array */
    public double[] output(double[] inputs) {
        double[] outputs = inputs;
        for(Layer layer : layers) {
            outputs = layer.output(outputs);
        }
        return outputs;
    }

}
