package com.company;

import java.util.Stack;

public class CHECK_STRING_WELL_FORMED_OR_NOT {
    public static void main(String[] args) {
        String str = "[{()}]";
        //check any one String-->
       // String str = "[{(}]";
        Stack<Character>st = new Stack<>();

        //create a loop and traverse the whole string
        for (int i = 0; i < str.length(); i++){
            char ch= str.charAt(i);
            if (st.empty()){
                st.push(ch);
            }
            //check bracket if bracket are opening then push into stack
            else if (ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            //check bracket & st.peek() are both same then pop the item
            else if (ch == ')' && st.peek() == '('){
                st.pop();
            }
            else if (ch == '}' && st.peek() == '{'){
                st.pop();
            }
            else if (ch == ']' && st.peek() == '['){
                st.pop();
            }
        }
        if (st.empty()){
            System.out.println("string is well");
        }
        else {
            System.out.println("string is not well");
        }
    }
}
