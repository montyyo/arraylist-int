
import java.util.ArrayList;
public class ArrayListInt
{
  
    private int[] numbers;
    
    public ArrayListInt()
    {
       this.numbers = new int[0];
       
    }
    
    /**
     * añade un elemento al final de la lista
     */
    public void lastElement(int lastElement)
    {
        int[] newNumbers= new int [numbers.length + 1]; //nuevo array
        
        for(int index = 0; index < numbers.length ; index++) //recorremos el array y copiamos laos fdatos
        {
            newNumbers[index]= numbers[index]; //copia de datos en posiciones
        }
        newNumbers[numbers.length]=lastElement; //introduccion del dato en ultima posicion
        
        numbers=newNumbers;//copia de array
    }
    
    /**
     * nuevo elemento en la posicion indicada
     */
    public void set(int index,  int elemento)
    {
        if(numbers.length > index)
        {
            boolean exit=false;
            int pos=0;
            while (pos < numbers.length && exit != true)
            {
                
                if(pos == index)
                {
                    numbers[index]= elemento;
                    exit=true;
                }
                pos++;
            }
        }
               
                
      }
    
      /**
       * añade elemento en una posicion
       */
      public void add(int index,  int elemento)
      {
         if(numbers.length > index)
        {
            
            int pos=0;
            
            int[] newNumbers= new int [numbers.length + 1]; //nuevo array
            
            while (pos < numbers.length +1)
            {
                if(pos==index)
                {
                    newNumbers[index]=elemento;
                }
                else if(pos > index)
                {
                    newNumbers[pos ]= numbers[pos-1]; //copia de datos en posiciones 
                }
                else if(pos < index)
                {                
                    newNumbers[pos]= numbers[pos]; //copia de datos en posiciones
                }
                pos++;
            }
            numbers=newNumbers;//copia de array
        }
      }
      
      /**
       * vacia el array
       */
      public void clear()
      {
          int [] newNumbers= new int [numbers.length];
          numbers=newNumbers;
          
      }
      
      /**
       * comprobar la existencia de un numero
       */
      public boolean contains(int elemento)
      {
          boolean exist = false;
          int index = 0;
          while(index < numbers.length  )
          {
              if(numbers[index]==elemento)
              {
                exist=true;
              }
             
              index++;
          }
          return exist;
      }
      
      /**
       * devuelve el elemento en una posicion si existe sino devuelve-1
       */
      public int get(int index)
      {
          int number = -1;
          
          if(numbers.length > index)
          {
              number=numbers[index];
          }
        
         
          return number;
          
          
      }
      
      /**
       * devuelve el indice en el que aparece la primera ocurrencia
       * del elemento especificado o -1 en caso de que la colección no
       * contenga el elemento especificado.
       */
      public int indexOf(int elemento)
      {
          boolean out=false;
          int number = -1;
          int index=0;
          while(index < numbers.length  && out == false)
          {
              if(numbers[index]==elemento)
              {
                number = numbers[index];
                out = true;
              }
             
              index++;
          }
          return number;
      }
      
      /**
       * esta vacia la lista
       */
      public boolean isEmpty()
      {
          boolean empty=true;
          
          if(numbers.length > 0)
          {
              empty=false;
          }
          
          return empty;
       }
       
       /**
        * elimina elemento
        */
       
       public int remove(int index)
       {
           int numero = -1;
           if(index < numbers.length)
           {
               numero= numbers[index];
               numbers[index] = 0;
               
           }
           
           return numero;
       }
       
       /**
        * tamaño de la lista
        */

       public int size()
       {
           int tamaño= numbers.length;
           return tamaño;
       }
      
}
