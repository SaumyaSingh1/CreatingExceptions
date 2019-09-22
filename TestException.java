import java.util.*;
class Myexception extends Exception
{
int a;
Myexception(int x){
a=x;
}
void show(){
System.out.println("Number is not positive");
}
}

class TestException{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int a;
a=scan.nextInt();
if(a<0){
try{
throw new Myexception(a);
}
catch(Myexception e){
System.out.println(e);
}
}else{
System.out.println("Number is positive");
}
}
}