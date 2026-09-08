import java.util.Scanner;
class Des{
public static void main(String []args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
for(int s=1;s<=n-i;s++){
System.out.print("  ");
}
for(int r=i;r>=1;r--){
System.out.print(r+" ");
}
for(int j=2;j<=i;j++){
System.out.print(j+" ");
}
System.out.println();
}
}
}
/*output:6
          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5
6 5 4 3 2 1 2 3 4 5 6
  */
