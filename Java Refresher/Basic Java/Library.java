
public class Library {
	
		private int numBook;
		
		

		public int getNumBook() {
			return numBook;
		}

		public void setNumBook(int numBook) {
			this.numBook = numBook;
		}
		int rentBook() {
			return numBook--;
		}
		int lendBook() {
			return numBook++;
		}
}
		


