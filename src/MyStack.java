import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MyStack<E> {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError();
        }
        arr[index]=element;
        index++;
    }
    public boolean isFull(){
        if (size==index){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        return false;
    }

    public int[] reverse() {
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[arr.length - 1 - i] = arr[i];
        }
        return newArr;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                ", index=" + index +
                '}';
    }
}
