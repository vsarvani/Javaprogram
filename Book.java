package package4;

  public class Book {
  double bookweight;
  BookSize booksize;       //Book class "has a" BookSize class "composition"
  String name;
     public static void main(String[] args) {
    	 BookSize bs=new BookSize();
 	    bs.length=25;
 	    bs.width=14;
 	    bs.depth=5;
 	    
    	 Book b1=new Book();
    	 b1.bookweight=4.3;
	    System.out.println("Book weight is "+ b1.bookweight +" lb");
	    b1.name="Basics of Java";
	    System.out.println("Book name is "+b1.name);
	    b1.booksize=bs;
	    System.out.println("book length,width,depth is "+ b1.booksize.length+" cms "+b1.booksize.width+" cms "+b1.booksize.depth+" cms respectively");
	    
	    
      }
  }
 
   class BookSize{
	
	int length;
	int depth;
	int width;
	
	
	
	
	
   }
