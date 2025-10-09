class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity = 0;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) this.resize();
        this.arr[size++] = n;
    }

    public int popback() {
        return this.arr[--this.size];
    }

    private void resize() {
        this.capacity *= 2;
        int [] newArr = new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
