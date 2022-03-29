package myjava1;
class Language {
	  public void displayInfo() {
	    System.out.println("python Language");
	  }
	}

class Java extends Language {
	  @Override
	  public void displayInfo() {
	    System.out.println("Java Programming Language");
	  }
	}
class C extends Language {
	  @Override
	  public void displayInfo() {
	    System.out.println("C Programming Language");
	  }
	}
public class polymorphismeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
			    Java j1 = new Java();
			    j1.displayInfo();
			   
			    Language l1 = new Language();
			    l1.displayInfo();
			    
			    C C1 = new C();
			    C1.displayInfo();
			  }
	}


