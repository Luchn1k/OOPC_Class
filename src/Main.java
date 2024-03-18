class ABC<T> {
  private T data;

  public ABC(T data){
      this.data = data;
  }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class XYZ{

}

class Test{
    public static void main(String[] args) {
        ABC<Integer> integerABC = new ABC<>(43);
        System.out.println(integerABC.getData());

        ABC<String> stringABC = new ABC<>("abc");
        System.out.println(stringABC.getData());

        ABC<XYZ> xyz = new ABC<>(new XYZ());
        System.out.println(xyz.getData());
    }
}