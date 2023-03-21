package AdapterDesignPattern;

import java.util.*;

interface MathProcessing{
    public void performMathOperation(String type,Integer[] data);
}

class BasicMathProcessing implements MathProcessing {
    MathDataAdapter mdp = new MathDataAdapter();
    @Override
    public void performMathOperation(String type, Integer[] data) {
        mdp.performMathOperation(type,data);
    }
}
class AdvancedMathProcessing {
    public void calcAverage(List<Integer> data) {
        int length = data.size();
        int sum = 0;
        for (Integer datum : data) {
            sum += datum;
        }
        System.out.println("Average: \n"+sum/length);
    }

    public void sortData(List<Integer> ls) {
        Integer[] arr = new Integer[ls.size()];
        ls.toArray(arr);
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(+i+" ");
        }
    }
    public int searchData(List<Integer> ls, int key) {
        Integer[] arr = new Integer[ls.size()];
        ls.toArray(arr);
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("Key Found!\n");
                return i;
            }
        }
        return -1;
    }
    public void replace(List<Integer> ls, int key, int value) {
        Integer[] arr = new Integer[ls.size()];
        ls.toArray(arr);
        for(int a = 0; a<arr.length; a++) {
            if(arr[a] == key) {
                arr[a] = value;
            }
        }
    }
}

class MathDataAdapter implements MathProcessing{
    AdvancedMathProcessing amp = new AdvancedMathProcessing();
    Scanner sc = new Scanner(System.in);
    @Override
    public void performMathOperation(String type, Integer[] data) {
        List<Integer> ls = Arrays.asList(data);
        if(type.equalsIgnoreCase("+")) {
            int sum = 0;
            for (Integer datum : data) {
                sum += datum;
            }
            System.out.println("The addition of all the elements of the array is: \n"+sum);
        }
        else if (type.equalsIgnoreCase("*")) {
            int total = 1;
            for(Integer datum : data) {
                total *= datum;
                System.out.println("The multiplication of all the elements of the array is: \n"+total);
            }
        }
        if(type.equalsIgnoreCase("average")) {
            amp.calcAverage(ls);
        }
        else if(type.equalsIgnoreCase("sort")) {
            amp.sortData(ls);
        }
        else if(type.equalsIgnoreCase("search")) {
            System.out.println("Enter the value to search: \n");
            int key = sc.nextInt();
            amp.searchData(ls,key);
        }
        else {
            System.out.println("Enter the data to replace: \n");
            int key = sc.nextInt();
            System.out.println("Enter the new value: \n");
            int value = sc.nextInt();
            amp.replace(ls,key,value);
        }
    }
}

public class Example3 {
    public static void main(String[] args) {
        MathProcessing mp = new BasicMathProcessing();
        Integer[] arr = {23,1,0,56,98,3,5,7};
        mp.performMathOperation("search",arr);
    }
}
