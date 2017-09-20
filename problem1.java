//My solution for Euler problem #1

public final class problem1 {
  public static void main(String[] args){
    //one loop
    int sum = 0; //multiples of 3 and 5
    for (int i = 0; i < 1000; i++) {
      if (i%3 == 0 || i%5 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
