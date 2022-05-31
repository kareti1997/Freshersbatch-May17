package persistance;

public class UserDemo {
public static void main(String[] args) {
	Persistance1 fp=new FilePersistance();
	fp.persist();
	Persistance1 dp=new DataPersistance();
	dp.persist();
}
}