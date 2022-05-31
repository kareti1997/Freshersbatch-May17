package Assignment2;

public class singletone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataBase db1;
		db1=DataBase.getInstance();
		db1.getConnection();
		}
		}
		class DataBase
		{
		private static DataBase dbo;
		private DataBase() {
		} public static DataBase getInstance()
		{
		if(dbo==null)
		dbo=new DataBase();
		return dbo;
		}
		public void getConnection() {
		System.out.print("DataBase connected");
		}
		}




	