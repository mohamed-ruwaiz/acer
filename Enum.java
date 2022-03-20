package myjava1;

public class Enum {
     enum GameLevel{
    	 LOW,
    	 MEDIUM,
    	 HIGH
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      GameLevel a=GameLevel.HIGH;
      /*enum in switch*/
 	switch(a) {
		case LOW:
			System.out.println("LOW LEVEL");
			break;
		case MEDIUM:
			System.out.println("MEDIUM LEVEL");
			break;
		case HIGH:
			System.out.println("HIGH LEVEL");
			break; 
 	}
 	/*for in enum*/
		for (GameLevel level : GameLevel.values()){
			System.out.println(level);
			
 	}
 	}
}
