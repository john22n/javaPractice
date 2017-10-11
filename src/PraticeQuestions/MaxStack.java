package PraticeQuestions;
import java.util.Stack;
/**
 * Created by JohnNoriega22 on 10/8/17.
 */
public class MaxStack {
    // access the largest element in the stack

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> maxesStack = new Stack<>();

    // add new item to the top of our stack
    // if item greater than or equal to the last item in maxesstack its a new max so add it to maxesStack

    public void push(int item) {
        stack.push(item);
        if (maxesStack.empty() || item >= maxesStack.peek()) {
            maxesStack.push(item);
        }
    }

    //remove and return the top item from out stack if it equals the top item in maxesstack
    // they must have been pushed in together
    // So we'll pop it out

    public int pop() {
        int item = stack.pop();
        if (item == maxesStack.peek()) {
            maxesStack.pop();

        }
        return item;

    }
    public int getMax() {
        return maxesStack.peek();
    }

    public static void main(String[] args) {
        MaxStack max = new MaxStack();
        max.push(1);
        max.push(2);
        max.push(4);
        max.push(5);
        max.pop();

        max.getMax();
    }
}
