
public class KidsMagazine extends Publisher{
    protected String recommendAgeRange;

    public KidsMagazine(){
        super();
        String recommendAgeRange = null;
    }
    public KidsMagazine(String publication, String title,int pageNum, double price,String recommendAgeRange){
        super(publication, title, pageNum, price);
        this.recommendAgeRange = recommendAgeRange;
    }
    @Override
    public void Display(){
        System.out.println("The "+publication+" has publishs "+ title+" , "+pageNum+" , "+price+" Baht");
        System.out.println("this kid magazine should read at age"+recommendAgeRange);
    }

}

