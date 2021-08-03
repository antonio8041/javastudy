package ch21;

public class ObjCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        //System.arraycopy(src, srcPos, dest, destPos, length);
        System.arraycopy(library, 0, copyLibrary, 0, 5);

        System.out.println("======copy library=========");
        for( Book book : copyLibrary ) {
			book.showBookInfo();
		}
        library[0].setTitle("나목");
		library[0].setAuthor("박완서");

        System.out.println("======library=========");
		for( Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("======copy library=========");
		
		for( Book book : copyLibrary) {
			book.showBookInfo();
		}



    }
}
