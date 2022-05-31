package persistance;

abstract class Persistance1 {
abstract void persist();
}
class FilePersistance extends Persistance1{
	void persist() {
	System.out.println("this data is from FilePersistance");
}
}
class DataPersistance extends Persistance1{
	void persist() {
	System.out.println("this data is from DataPersistance");
}
}
