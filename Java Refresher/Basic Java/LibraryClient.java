
public class LibraryClient {

	public static void main(String[] args) {
		
				
		// TODO Auto-generated method stub
		Library l1=new Library();
		l1.setNumBook(10);
		l1.getNumBook();
		int book=l1.rentBook();
		System.out.println(l1.getNumBook());
		int book1=l1.lendBook();
		System.out.println(l1.getNumBook());
		

	}

}
