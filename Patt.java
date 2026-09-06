import java.util.Scanner;
class Patt{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
for(int i=1;i<=n;i++){
for(int k=1;k<=i-1;k++){
System.out.print(" ");
}
for(int j=1;j<=n-i+1;j++){
System.out.print(j+" ");
}
System.out.println();
}
}
}
 Example output   /*output1 2 3 4 5
                          1 2 3 4
                          1 2 3
                           1 2
                           1*/
