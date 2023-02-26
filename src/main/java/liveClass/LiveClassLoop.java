package liveClass;

public class LiveClassLoop {
  public static void main(String[] args) {

    int[] arr = {1, 56, 7, 28, 97, 96, 12, 99};

    int max=0, min=0; max = arr[0]; min = arr[0];
    int sum = 0;

    for(int i=1;i<arr.length;i++){
      if(arr[i] > max){
        max = arr[i];
      } if(arr[i] < min){
        min = arr[i];
      }
      sum += arr[i];
    }
    System.out.println(max);
    System.out.println(min);
    System.out.println(sum/arr.length);
  }
}
