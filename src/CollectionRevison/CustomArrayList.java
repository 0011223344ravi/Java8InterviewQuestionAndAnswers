package CollectionRevison;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList
{
     @Override
     public boolean add(Object o){
   if(this.contains(o)){

       return true ;
   }

   else {
      return super.add(o);
   }
     }
    public static void main(String[] args) {

        CustomArrayList  al = new CustomArrayList();
        al.add(50);
        al.add(50);
        al.add(30);
        System.out.println(al);
    }


}
