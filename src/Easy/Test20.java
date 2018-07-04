package Easy;
// can use LinkedList
public class Test20 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack stack = new Stack(chars.length);
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                Character pop = stack.pop();
                if (pop == null) return false;
                switch (c) {
                    case ')':
                        if (pop != '(')
                            return false;
                        break;
                    case ']':
                        if (pop != '[')
                            return false;
                        break;
                    case '}':
                        if (pop != '{')
                            return false;
                        break;
                }
            }
        }
        if (stack.isEmpty())
            return true;
        else return false;
    }

    class Stack {
        private char[] chars;
        private int index;
        private Stack(int length) {
            this.chars = new char[length];
            this.index = 0;
        }

        private boolean isEmpty() {
            return this.index == 0;
        }

        private boolean isFull() {
            return this.index == chars.length;
        }

        public void push (char c) {
            if (isFull()) {
                return;
            }
            chars[this.index++] = c;
        }

        public Character pop () {
            if (isEmpty())
                return null;
            return chars[--this.index];
        }
    }
    public static void main(String[] args) {
        Test20 temp = new Test20();
        System.out.println(temp.isValid("["));
    }
}
