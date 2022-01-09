package DesignPatternComposite.DesignPatternComposite;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Product p1= new Product(1,"product1");
        Category g1= new Category(1,"Category1");
        Category g01= new Category(2,"Category01");
        Category g02= new Category(2,"Category02");
        Category g3= new Category(2,"Category03");
  
        g1.add(p1);
        g1.add(g01);
        g1.add(g02);
        g02.add(g3);
        g1.view();
    }
}
