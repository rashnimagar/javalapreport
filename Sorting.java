package Methodoverloading;

class Sorter{
    void sort(int[] array){
        System.out.println("Sorting integer..");
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int num: array){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    void sort(String[] array){
        System.out.println("Sorting string...");
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i].compareTo(array[j])>0){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(String str: array){
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
public class Sorting {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int[] intArray = {10,25,8,6,3};
        String[] strArray = {"Rashni", "Babita", "Ankita"};
        sorter.sort(intArray);
        sorter.sort(strArray);
    }
}
