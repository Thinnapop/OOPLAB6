
public class Magazine extends Publisher{
    protected String publicationUnit;

    public Magazine(){
        super();
        String publicationUnit = null;
    }
    public Magazine(String publication ,String title,int pageNum, double price,String publicationUnit){
        super(publication, title, pageNum, price);
        this.publicationUnit = publicationUnit;
    }
    @Override
    public void Display(){
        System.out.println("The "+publication+" has publishs "+ publisher+" , "+pageNum+" , "+price+" Baht ");
        System.out.println("this magazine is "+publicationUnit+"print" );
    }

}
