public class FindMax {
    public int[] price;
    public FindMax(int[] price) {
        this.price = price;
    }
    public int findMax() {
        return sum(0, price.length - 1);
    }
    public int sum(int left, int right) {
        if (left > right) throw new IndexOutOfBoundsException("Not possible");
        if (left == right) return price[left];
        int middle = (left + right) / 2;
        int sumMaxLeft = 0;
        int sumMaxRight = 0;
        int currentSum = 0;
        for (int i = middle; i >= left; i--) {
            currentSum += price[i];
            sumMaxLeft = Math.max(currentSum, sumMaxLeft);
        }
        currentSum = 0;
        for (int i = middle + 1; i <= right; i++) {
            currentSum += price[i];
            sumMaxRight = Math.max(currentSum, sumMaxRight);
        }
        return Math.max(sumMaxLeft + sumMaxRight, Math.max(sum(left, middle), sum(middle + 1, right)));
     }
     public static void main(String[] args) {
         FindMax arr = new FindMax(new int[] {112, 0, -36, 29, 8, -11, 7});
         System.out.println(arr.findMax());
     }
}
