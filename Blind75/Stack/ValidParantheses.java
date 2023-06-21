package Blind75.Stack;

import java.util.ArrayList;

public class ValidParantheses {

    private ArrayList<Character> stack;
    private int stackTop;

    public ValidParantheses () {
        this.stack = new ArrayList<>();
        this.stackTop = -1;
    }

    private void push (Character paranthesesToPush) {
        this.stack.add(paranthesesToPush);
        this.stackTop++;
    }

    private Character pop () {
        if (this.stack.size() > 0) {
            char lastElem = this.stack.remove(this.stackTop);
            this.stackTop--;

            return lastElem;
        }
        return null;
    }

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        
        for (char charS : s.toCharArray()) {
            if (charS == '{' || charS == '(' || charS == '[') {
                this.push(charS);
            }
            else {
                Character poppedElem = this.pop();
                if (poppedElem == null) {
                    return false;
                }
                else if ((poppedElem == '{' && charS == '}') || (poppedElem == '(' && charS == ')') || (poppedElem == '[' && charS == ']')) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }

        if (this.stack.size() > 0) {
            return false;
        }

        return true;    
    }
}
