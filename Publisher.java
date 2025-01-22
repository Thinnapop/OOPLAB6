package LAB_6.Chap1;
public class Publisher {
    protected String publication;
    protected String publisher;
    protected int pageNum;
    protected double price;
    protected String title;

    public Publisher(){
        String publication = null;
        String publisher = null;
        int pageNum = 0;
        double price = 0.0;
    }
    public Publisher(String publication,String title, int pageNum, double price){
        this.publication = publication;
        this.pageNum = pageNum;
        this.price = price;
        this.title = title;
    }
    public void Display(){
        System.out.println("The "+publication+" has publishs "+ title+" , "+pageNum+" , "+price+" Baht");
    }
}



