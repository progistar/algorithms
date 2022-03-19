package leetcode_daily;

import java.io.IOException;
import java.util.Hashtable;
import java.util.LinkedList;

class FreqStack {
	
	/**
	 * Note that !
	 * The frequency of each number is updated as the number is stacked. <br>
	 * If the number is popped, then the frequency of the number is also decreased. <br>
	 * 
	 * There are stacks for representing frequency such as:<br>
	 * For example, push 5, 7, 5, 7, 4, 5 in the order <br>
	 * frequency	stack list <br>
	 * 1	5->7->4 <br>
	 * 2	5->7 <br>
	 * 3	5 <br>
	 * <br>
	 * 
	 * Memorize the maximum frequent = 3 now <br>
	 * If we pop, then the most frequent stack will be chosen <br>
	 * ex> statk (5) for frequency 3. <br>
	 * After popping, if the stack is empty then decrease the maximum frequency by 1. <br>
	 * 
	 * 
	 */
	public Hashtable<Integer, LinkedList<Integer>> freqStacks = new Hashtable<Integer, LinkedList<Integer>>();
	public Hashtable<Integer, Integer> numToFreq = new Hashtable<Integer, Integer>();
	
	public int maxFrequent = 0;
	
    public FreqStack() {
        
    }
    
    public void push(int val) {
        Integer freq = numToFreq.get(val);
        if(freq == null) {
        	freq = 0;
        }
        freq++;
        
        // increase frequency of the value
        numToFreq.put(val, freq);
        
        LinkedList<Integer> stack = freqStacks.get(freq);
        if(stack == null) {
        	stack = new LinkedList<Integer>();
        }
        
        stack.addLast(val);
        freqStacks.put(freq, stack);
        
        // update max frequency
        maxFrequent = Math.max(freq, maxFrequent);
    }
    
    public int pop() {
    	
    	LinkedList<Integer> stack = freqStacks.get(maxFrequent);
    	
    	int popVal = stack.pollLast();
    	
    	numToFreq.put(popVal, maxFrequent-1);
    	
    	if(stack.isEmpty()) {
    		maxFrequent--;
    	}
    	
        return popVal;
    }
}

public class _20220319 {

	// Test runner
	
	public static void main(String[] args) throws IOException {
		FreqStack stack = new FreqStack();
		
		stack.push(5);
		stack.push(7);
		stack.push(5);
		stack.push(7);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack.maxFrequent);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
}
