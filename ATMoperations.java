import java.util.Scanner;
class ATMoperations
{
public static void main(String args[])
{
int balance=0;
Scanner i = new Scanner(System.in);
while(true){
System.out.println("ATM Machine");
System.out.println("Choose 1 for Withdraw");
System.out.println("Choose 2 for Deposit");
System.out.println("Choose 3 for Check Balance");
System.out.println("Choose 4 for EXIT");


System.out.println("Choose the operation");
int number=i.nextInt();
if(number==1){

System.out.println("Enter money to be withdraw:");
int withdraw=i.nextInt();
if(balance>=withdraw){
balance=balance-withdraw;
System.out.println("sucessful withdraw");
}
else{
System.out.println("Insufficient Balance");
}
}
else if(number==2){

System.out.println("Enter money to be deposit:");
int deposit =i.nextInt();
balance=balance+deposit;
System.out.println("Your money has been sucessfully deposited!");
}
else if(number==3){

System.out.println("Balance:"+balance);
}
else if(number==4){
System.exit(0);

}
}

}
}