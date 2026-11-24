public class Arraytask {
  public static void main (String [] args){
    int [] arr={2,3,4,5,6,7,8};
    int min=arr[0];
    int max=arr[0];
    for (int i:arr){
      if(i<min){
        min=i;
      }
    }
     for (int i:arr){
      if(i>max){
        max=i;
      }
    }
    int sum=0;
    for (int i:arr){
      sum +=i;
    }
    System.out.println("min: "+min);
    System.out.println("max: "+max);
    System.out.println("average: "+sum/arr.length);
  }
  
}