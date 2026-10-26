public class BalancedBrackets {

    public static boolean isBalanced(String s) {

        BracketStack stack = new BracketStack();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();

                if (!isMatchingPair(opening, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {

        if (opening == '(' && closing == ')') {
            return true;
        }

        if (opening == '[' && closing == ']') {
            return true;
        }

        if (opening == '{' && closing == '}') {
            return true;
        }

        return false;
    }
}