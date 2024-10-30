import java.io.*;

public class Eagle implements Pet, Attribute, Serializable{
  enum happynessLevel{
    ANGRY,
    SAD1,
    SAD,
    BORED,
    HAPPY,
    HAPPY1,
    ATTACK
  }

  enum hungerLevel{
    EATYOU,
    MIGHTEATYOU,
    VERYHUNGRY,
    HUNGRY,
    NOTHUNGRY,
    FULL
  }

    enum color{
        BLACKORANGE,
        BLACKWHITE
    }
    
    happynessLevel mood = happynessLevel.BORED;
    hungerLevel hungry = hungerLevel.HUNGRY;
    color look = color.BLACKORANGE;

  public void play ()
  {
    System.out.println ();
    System.out.
      println
      ("A royal bird, symbol of war and imperial power is playing like a child (bB4b!`b)");
    System.out.println ("Happiness level increased \nHunger level increased");
    System.out.println ();

    incrementHunger();
    incrementHappiness();

  }

  public void feed ()
  {
    System.out.println ();
    System.out.
      println ("Your Eagle just ate, he liked sea birs more than fish!");
      decrementHunger();

    }
    
    public void incrementHappiness(){
        switch(mood) {
            case ANGRY:
                mood = happynessLevel.SAD1;
                break;
            case SAD1:
                mood = happynessLevel.SAD;
                break;
            case SAD:
                mood = happynessLevel.BORED;
                break;
            case BORED:
                mood = happynessLevel.HAPPY;
                break;
            case HAPPY:
                mood = happynessLevel.HAPPY1;
                break;
            case HAPPY1:
                mood = happynessLevel.ATTACK;
                break;
            case ATTACK:
                mood = happynessLevel.ANGRY;
                break;
        }
    }

    public void incrementHunger(){
            switch (hungry){
            case EATYOU:
                hungry = hungerLevel.FULL;
                break;
            case MIGHTEATYOU:
                hungry = hungerLevel.EATYOU;
                break;
            case VERYHUNGRY:
                hungry = hungerLevel.MIGHTEATYOU;
                break;
            case HUNGRY:
                hungry = hungerLevel.VERYHUNGRY;
                break;
            case NOTHUNGRY:
                hungry = hungerLevel.HUNGRY;
                break;
            case FULL:
                hungry = hungerLevel.NOTHUNGRY;
                break;
        }
    }
    
    public void decrementHunger(){
        switch (hungry){
            case EATYOU:
                hungry = hungerLevel.MIGHTEATYOU;
                break;
            case MIGHTEATYOU:
                hungry = hungerLevel.VERYHUNGRY;
                break;
            case VERYHUNGRY:
                hungry = hungerLevel.HUNGRY;
                break;
            case HUNGRY:
                hungry = hungerLevel.NOTHUNGRY;
                break;
            case NOTHUNGRY:
                hungry = hungerLevel.FULL;
                break;
            case FULL:
                hungry = hungerLevel.EATYOU;
                break;
        }
        System.out.println();
        
    }   



  public void makeSound ()
  {
    System.out.println ("Reeeeeeeeeeeeeeh Rehhhhheeeeeee!!");
    System.out.println ("Weeeeeeeeeeee!");
    System.out.println ("Reeeeeeeeeeeeeeh Rehhhhheeeeeee!!");
  }

  public void getColor ()
  {
    
        System.out.println();
        System.out.println ("white heads and tails with dark brown bodies and wings");

        System.out.println();

  }

  public void getHappiness ()
  {

    System.out.print ("Happiness level: ");
    switch (mood)
      {
      case ANGRY:
	System.out.println ("Angry!!");
	break;
      case SAD1:
	System.out.println ("Very Sad");
	break;
      case SAD:
	System.out.println ("Sad");
	break;
      case BORED:
	System.out.println ("Bored");
	break;
      case HAPPY:
	System.out.println ("Happy");
	break;
      case HAPPY1:
	System.out.println ("Very Happy");
	break;
      case ATTACK:
	System.out.println ("So happy that it might get a Heart attack!!!");
	break;

      }

  }

  public void getHunger ()
  {
    System.out.println ();
    System.out.print ("Hunger level: ");
    switch (hungry)
      {
      case EATYOU:
	System.out.println ("Hungry Enough that, he will Eat your cat!!!");
	break;
      case MIGHTEATYOU:
	System.out.println ("Might eat your cat! ");
	break;
      case VERYHUNGRY:
	System.out.println ("Very hungry");
	break;
      case HUNGRY:
	System.out.println ("Normal Hungry ");
	break;
      case NOTHUNGRY:
	System.out.println ("Not Hungry ");
	break;
      case FULL:
	System.out.println ("I'm Full, feeling sleepy! ");
	break;
      }
    System.out.println ();
  }

}
