class Test 
{ 
    static int a = 10; 
    static int b; 
    static void fun(){ 
        b = a * 4; 
    } 
} 
class MCQ{
   public static void main(String[] args) 
    { 
      Test t=new Test();
      t.fun();
      System.out.print(Test.a+Test.b);
    } 
} 


ans: 50
