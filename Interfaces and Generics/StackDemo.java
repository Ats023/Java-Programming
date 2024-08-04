interface IGenSimpleStack<T> {
	void push(T item) throws StackFullException;
	T pop() throws StackEmptyException;
	boolean isEmpty();
	boolean isFull();
}

class GenStack<T> implements IGenSimpleStack<T>{
    T[] arr;
    int top;
    GenStack(T[] array) {
        arr = array;
        top=0;
    }
    public void push(T obj) throws StackFullException {
        if(isFull()) throw new StackFullException(arr.length);
        arr[top++] = obj;
    }
    public T pop() throws StackEmptyException {
        if(isEmpty()) throw new StackEmptyException();
        return arr[--top];
    }
    public boolean isFull() {
        return top==arr.length;
    }
    public boolean isEmpty() {
        return top==0;
    }
}

class StackFullException extends Exception {
    int size;
    StackFullException(int n) {
        super("StackFull");
        size=n;
    }
    public String toString() {
        return("MAX SIZE "+size+": Cannot Push Object Into Stack.");
    }
}

class StackEmptyException extends Exception {
    StackEmptyException() {
        super("StackEmpty");
    }
    public String toString() {
        return("STACK EMPTY: Cannot Pop Object From Stack.");
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        GenStack<Integer> st = new GenStack<Integer>(arr);
        try {
            st.push(3);
            st.push(2);
            int x = st.pop();
            x=st.pop();
            st.push(7);
            st.push(2);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
        }
        catch (StackFullException e) {
            System.out.println(e);
        }
        catch (StackEmptyException e) {
            System.out.println(e);
        }
    }
}
