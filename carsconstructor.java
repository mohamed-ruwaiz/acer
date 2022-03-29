package myjava1;

public class carsconstructor {
     String carsName,carsCompany;
     int carsModel;
     carsconstructor(String name,String company,int model){
    	 carsName = name;
    	 carsCompany = company;
    	 carsModel = model;
     }
     void display()
     {
    	 System.out.print(carsName +" ");
    	 System.out.print(carsCompany +" ");
    	 System.out.print(carsModel +" ");
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     carsconstructor myobj = new carsconstructor("suv","hyundai",2019);
     myobj.display();
	}

}
