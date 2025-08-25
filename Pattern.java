 import java.util.*;
public class pattern{
    public static void main (String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the value of n :");
          int n = sc.nextInt();

        //Question No  1 the square pattern 
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print('*');
            }
            System.out.println();
        }


        // Question No  2 right half payramid
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        //Question No 3 reverse right half pyramid
          for(int i = n; i>= 1; i--){
            for(int j = 1; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

       //Question No 4 left half pyramid 
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if((i+j) < n+1){
                    System.out.print(' ');
                }
                else{
                    
                    System.out.print('*');
                }
            }
            System.out.println();
        }

        //Question No 5 reverse left half pyramid 
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=n; j++){
                if((i+j) < n+1){
                    System.out.print(' ');
                }
                else{
                    
                    System.out.print('*');
                }
            }
            System.out.println();
        }

        // Question No 6  triangle shape
         for(int i = 1; i<= n; i++){
            for(int j = 1; j<=i; j++){

                System.out.print("*");
            }
            System.out.println();
        }

        // Question No 7 hollow rectangel shape
         for(int i = 1; i<= n; i++){
            for(int j = 1; j<=n; j++){

                if(i==1 || j==1 || i==n || j==n){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    // Question No 8 right pyramic triangle but with numbers 
       for(int i = 1; i<=n;i++){
        for(int j = 1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
       }

       // Question No 9 reverse right pyramic triangle but with numbers 
       for(int i = n; i>=1;i--){
        for(int j = 1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
       }

        // Question No 10 right pyramic triangle but with numbers 
        int count = 1;
           for(int i = 1; i<=n;i++){
        for(int j = 1; j<=i; j++){
            System.out.print(count);
            count++;
        }
        System.out.println();
       }

         // Question No 11 right pyramic triangle but with 1 and 0 
           for(int i = 1; i<=n;i++){
               for(int j = 1; j<=i; j++){
            if((i+j) % 2 == 0){
                System.out.print("1");
            }   
            else{
                System.out.print("0");
            }
            }
            System.out.println();
           }


            // Question No 12 B2 Bomber shape
           for(int i = 1; i<=n;i++){
               for(int j = 1; j<=i; j++){
            if((i+j) % 2 == 0){
                System.out.print("*");
            }   
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
           }
               for(int i = n; i>=1;i--){
               for(int j = 1; j<=i; j++){
            if((i+j) % 2 == 0){
                System.out.print("*");
            }   
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
           }

// Question No 13 butterfly shape
for(int i = 1; i<=n; i++){
    for(int j = 1; j<=i; j++){
        System.out.print('*');
    }
    int space = 2*(n-i);
    for(int j = 1; j<=space;j++){    
     System.out.print(" ");
    }
     for(int j = 1; j<=i; j++){
        System.out.print('*');
    }
    System.out.println();
}
for(int i = n; i>=1; i--){
    for(int j = 1; j<=i; j++){
        System.out.print('*');
    }
    int space = 2*(n-i);
    for(int j = 1; j<=space;j++){    
     System.out.print(" ");
    }
     for(int j = 1; j<=i; j++){
        System.out.print('*');
    }
    System.out.println();
}





// Question No 14   2butterfly with each other 
for(int i = 1; i<=n; i++){
    for(int j = 1; j<=i; j++){
        System.out.print('*');
    }
    int space = 2*(n-i);
    for(int j = 1; j<=space;j++){    
     System.out.print(" ");
    }
     for(int j = 1; j<=i; j++){
        System.out.print('*');
    }
     for(int j = 1; j<=i; j++){
        System.out.print('*');
    }
    for(int j = 1; j<=space;j++){    
     System.out.print(" ");
    }
     for(int j = 1; j<=i; j++){
        System.out.print('*');
    }
    System.out.println();
}
for(int i = n; i>=1; i--){
    for(int j = 1; j<=i; j++){
        System.out.print('*');
    }
    int space = 2*(n-i);
    for(int j = 1; j<=space;j++){    
     System.out.print(" ");
    }
     for(int j = 1; j<=i; j++){
        System.out.print('*');
    }
      for(int j = 1; j<=i; j++){
        System.out.print('*');
    }
   
    for(int j = 1; j<=space;j++){    
     System.out.print(" ");
    }
     for(int j = 1; j<=i; j++){
        System.out.print('*');
    }
    System.out.println();
}

// Question No 15  italic rectangel
 
for(int i = 1; i<=n; i++){
    int spaces = n-i;

    for(int j = 1; j<=spaces; j++){
        System.out.print(' ');
    }
    for( int j = 1; j<=n; j++){
        System.out.print("*");
    }
    System.out.println();
}



//Question No 16 Numbers pyaramid 

for(int i = 1; i<=n; i++){
    int spaces = n-i;

    for(int j = 1; j<=spaces; j++){
        System.out.print(' ');
    }
    for( int j = 1; j<=i; j++){
        System.out.print(i+" ");
    }
    System.out.println();
}



// question no 17 palidrom pyarmid 

for(int i = 1; i<=n; i++){

    // spaces 
    int spaces = n-i;
    for(int j = 1; j<=spaces; j++){
        System.out.print(' ');
    }
    for(int j =i; j>=1; j--){
        System.out.print(j);
    }
    for(int j = 2; j<=i; j++){
        System.out.print(j);
    }
    System.out.println();
}
 
// question no 18 diamond pattern 

for(int i = 1; i<=n; i++){
    int spaces = n-i;

    for(int j = 1; j<=spaces; j++){
        System.out.print(' ');
    }
    for( int j = 1; j<=(2*i)-1; j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i = n; i>=1; i--){
    int spaces = n-i;

    for(int j = 1; j<=spaces; j++){
        System.out.print(' ');
    }
    for( int j = 1; j<=(2*i)-1; j++){
        System.out.print("*");
    }
    System.out.println();
}

    }
}