package PraticeQuestions;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Created by JohnNoriega22 on 10/8/17.
 */
public class QueueWith2Stacks {

    private Stack<Integer> inStack = new Stack<>();
    private Stack<Integer> outStack = new Stack<>();

    public void enqueue(int item) {
        inStack.push(item);
    }

    public int dequeue() {
        if (outStack.empty()) {
            //move items from instack to outstack
            while(!inStack.empty()) {
                int newestInStack = inStack.peek();
                outStack.push(newestInStack);
                inStack.pop();
            }
            // if outstack is still empty raise error
            if (outStack.empty()) {
                throw new NoSuchElementException("cant dequeue from empty");
            }
        }
        return outStack.pop();
    }

}
