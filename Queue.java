import java.util.Scanner;

class Queue{
    int size = 10;
    //variable declarations
    int arr[] = new int[size+1];
    int head;
    int tail;
    
    // Default Constractor
    Queue(){
        head = 0;
        tail = 0;
    }

    //Push value in this Queue
    public void push(int val){
        if((tail + 1) % (size+1) == head){
            System.out.println("Queue is full !");
            return;
        }
        arr[tail] = val;
        tail = (tail + 1) % (size + 1);
    }

    //pop value from this Queue
    public int pop(){
        if(tail == head){
            System.out.println("Queue is empty !");
            return -1;
        }
        int value = arr[head];
        head = (head + 1) % (size + 1);
        return value;
    }

	

}

class HelloWorld {
    public static Scanner inp;
    static int check;
    static Queue q = new Queue();

    public static void println(String st){
        System.out.println(st);
    }

    public static void print(String st){
        System.out.print(st);
    }



    public static int menu(){
         
        println("Welcome to Menu");
        println("Press a key form menu : ");
        println("\t 1.Enqueue(push)");
        println("\t 2.Dequeue(pop)");
        println("\t 3.Exit");
    
    
        print("\n\t Enter your choice : ");
        inp = new Scanner(System.in);
    
        int command = inp.nextInt();
        
    
        return command;
    
    }


    public static void main(String[] args) {
         
         do{
            // System.out.print("\033[H\033[2J");  
            // System.out.flush();
            do{
                check = menu();
            }while((check > 3) || (check < 1));

            
            switch(check){
                case 1:
                    print("Enter a Value : ");
                    int val = inp.nextInt();
                    q.push(val);
                    break;
                case 2:
                    println("Value pop : "+q.pop());
                    break;
                case 3:
                    return;     
            }

        }while(check != 3);

    
    }
    
}

