
public class Account1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Account{
			private String Name;
			private String acc_type;
			private int Acc_num;
			private int Acc_Balance;
			   
			        public String getName() {
			        	return this.Name;
			        }
			        public String getAccountType() {
			        	return this.acc_type;
			        }
			        public int getAccountNum() {
			        	return this.Acc_num;
			        }
			        public int getAccBalance() {
			        	return this.Acc_Balance;
			        }
			        public void setName(String name) {
			        	this.Name=name;
			        }
			        public void setType(String type) {
			        	this.acc_type=type;
			        }
			        public void setAccBalance(int balance) {
			        	this.Acc_Balance=balance;
			        }
			        public void setAccountNum(int accnum) {
			        	this.Acc_num=accnum;
			        }
			        
			        public void display() {
			        	System.out.println("Name : "+this.getName());
				        System.out.println("Number of Account: "+this.getAccountNum());
				        System.out.println("Type of Account: " +this.getAccountType());
				        System.out.println("current balance: " +this.getAccBalance());
			        }
		}
		Account c = new Account();
		 
        c.setName("Ahmed");       
        c.setType("Current Account");
        c.setAccountNum(12453);
        c.setAccBalance(14000);
 
        c.display();


			
				 

			}

		


	}
