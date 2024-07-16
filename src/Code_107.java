public class Code_107 {
   String name;
   int age;
   boolean a;

   String getName(){
       return name;
   }
   int getAge(){
       return age;
   }
   boolean getA() {
       return a;
   }

   void setName(String name){
       this.name = name;
   }
   void setAge(int age){
       this.age = age;
   }
   void setA(boolean a){
       this.a = a;
   }
}


class Code_107Start{
    public static void main(String[] args){
        Code_107 code = new Code_107();
        System.out.println(code.getAge());
    }
}