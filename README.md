Object Oriented Neural Networks

Your entry point class will be 'Test_Dialogue_System.java' where you'll be taking user input using the 'Scanner' class. This will use the values of the output array of the neural network in order to determine the string response to give back to the user. The 'Network' class represents the entire network made up of layer objects, and uses the double array output of the final layer computed in the 'Layer' class to return the neural network's output. The 'Layer' class represents one layer of neurons in a neural network, and is made up of neuron objects. It stores the double output of each neuron in an output array, which is computed by calling 'layer.output()'. Finally, the 'Neuron' class represents a single neuron in a neural network. Each neuron has a random weight. It returns a double which is calculated by computing and incrementing the sum of each value of the weights array multiplied by the inputs array and transforming the input value between 0 and 1 using the sigmoid() function. I would recommend programming this project top down (‘Test_Dialogue_System.java’ -> ‘Test-Network.java’ -> ‘Test_Layer.java’ -> ‘Test_Neuron.java’). 
Your response in 'Test_Dialogue_System.java' will just be dependent on the location of the max. value in the output array, should be about a full sentence, and should make sense depending on the user input you plan to provide when using 'System.in' from the scanner. The user input should also be a full sentence, and the conversation should be class appropriate, and you should expand the ‘encodeUserInput’ array to contain a double array that spans the size of the String input. In this case, our inputs to the neural network will not correspond to any particular features (for example, parts of a face to reconstruct) since we're initializing the inputs to random values between 0 and 1. As mentioned in the code files, start off the conversation with a print statement outside the Scanner while loop.

Printed statement:  'Hi, how are you doing today?'. 
Example input: I’m doing fine, how’s everything for you? 
Example Response(s):
 'Great, I’m acing all my finals during finals week!!'
‘Not so good, I had a cold yesterday so I missed last week’s classes.’
‘Amazing! I just got a 5 on all my AP exams!’
‘Ok. I’m pretty tired and looking forward to the break.’
 
 

