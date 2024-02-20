package Stacks;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // stack = LIFO data structure. Last in first out
        // stores objects to into a sort of "veritical tower"
        // push() to add to the top
        // pop() to remove from the top

        Stack<String> stack = new Stack<>();

        stack.push("Minecraft");
        stack.push("FC2024");
        stack.push("Football Manager24");
        stack.push("Pokemon");
        stack.push("NBA2024");
        stack.pop();
        stack.pop();
        stack.pop();
        

        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
