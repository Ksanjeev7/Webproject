package com.sanju.com;
public class Customers {
         private  int C_Id;
         private   String  C_Name ;
         private   String C_email;
         private   String C_Address; 
         private   String C_city;
 
		

		public Customers(int C_Id, String C_Name, String C_email, String C_Address, String C_city) {
			 this.C_Id = C_Id;
			 this.C_Name = C_Name;
			 this. C_email = C_email;
			 this. C_Address = C_Address;
			 this. C_city = C_city;
		}

		public int getC_Id() {
			return C_Id;
		}
		
		public String getC_Name() {
			return C_Name;
		}
		
		public String getC_email() {
			return C_email;
		}
		
		public String getC_Address() {
			return C_Address;
		}
	
		public String getC_city() {
			return C_city;
		}
	
		public void setC_Name(String c_Name) {
			C_Name = c_Name;
		}
	
		public void setC_email(String c_email) {
			C_email = c_email;
		}
		
		public void setC_Address(String c_Address) {
			C_Address = c_Address;
		}
		
		public void setC_city(String c_city) {
			C_city = c_city;
		}

}





