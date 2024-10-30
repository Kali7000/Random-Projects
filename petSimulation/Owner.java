import java.util.*;
import java.io.*;


public class Owner{
    private static Serialization serial = new Serialization();
    private String name;
    Scanner scan = new Scanner(System.in);
    Tiger tiger = new Tiger();
    Eagle eagle = new Eagle();
    Owner(){
        this.name = "human1";
    }
    
    Owner(String username){
        this.name = username;
    }
    
    
    public void start(){
        
    	System.out.println("Choose a Pet to interact with: \n 1- Tiger \n 2- Eagle");
    	int num = scan.nextInt();
    		
    		if (num == 1){

    		    playTiger();
    		    
    		}else if (num == 2){
    		    playEagle();

    		}
    		
    }
    
    
    public void playTiger(){
        
        while(true){
        
            System.out.println("Choose from the following: \n 1- play \n 2- feed \n 3- make sound \n 4- view color \n 5- view hunger value \n 6- view happiness value \n 7- Exit");
            int input = scan.nextInt();
            if (input == 1){
                tiger.play();
                
            }else if (input ==2){
                tiger.feed();
                
            }else if (input ==3){
                tiger.makeSound();
                
            }else if (input ==4){
                tiger.getColor();
                
            }else if (input ==5){
                tiger.getHunger();
            }else if (input ==6){
                tiger.getHappiness();
            }else if (input ==7){
                //serial.save(dict, "tiger.ser");
                System.out.println("good bye!");
                break;
            }else{
                System.out.println("Invalid Input Try again!");
            }
            
        }
    }
    
    public void playEagle(){

        while(true){
        
            System.out.println("Choose from the following: \n 1- play \n 2- feed \n 3- make sound \n 4- view color \n 5- view hunger value \n 6- view happiness value \n 7- Exit");
            int input = scan.nextInt();
            if (input == 1){
                eagle.play();
                
            }else if (input ==2){
                eagle.feed();
                
            }else if (input ==3){
                eagle.makeSound();
                
            }else if (input ==4){
                eagle.getColor();
                
            }else if (input ==5){
                eagle.getHunger();
            }else if (input ==6){
                eagle.getHappiness();
            }else if (input ==7){
                System.out.println("good bye!");
                break;
            }else{
                System.out.println("Invalid Input Try again!");
            }
            
        }
        
        
        
    }

    
}

