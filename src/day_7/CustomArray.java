package day_7;

public class CustomArray<T> {
    private  Object[] array;
    private  int size;
    private  int currentSize = 0;

    public CustomArray(int size){
        this.currentSize = size;
        array = new Object[currentSize];
        this.size = 0;
    }
    public  CustomArray(){
        //default size
        this.currentSize = 5;
        array = new Object[currentSize];
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public  boolean isEmpty(){
        return size == 0;
    }

    private void resizeArray(){
        int newCapacity = array.length * 2;

        Object[] newArray = arrayCopy(new Object[newCapacity]);
        array = newArray;
        currentSize = newCapacity;
    }


    private  Object[] arrayCopy(Object[] newArray){
      for (int i = 0; i < array.length ; i ++){
          newArray[i] = array[i];
      }
      return  newArray;
    }
    public  void add(T element){
        if(size == array.length){
            resizeArray();
        }
        array[size] = element;
        size++;
    }

    public T get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound");
        }
        return (T)array[index];
    }


}


class TestArray{
    public static void main(String[] args) {
        CustomArray<String> s =  new CustomArray<>();
        s.add("Test");
        s.add("Test1");
        s.add("Test2");
        s.add("Test3");
        s.add("Test4");
        s.add("Test5");
        s.add("Test6");

      for(int i = 0 ; i < s.size() ; i ++){
          System.out.println(s.get(i));
      }
    }
}
