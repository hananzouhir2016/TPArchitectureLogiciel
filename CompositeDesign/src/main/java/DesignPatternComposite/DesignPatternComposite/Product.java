package DesignPatternComposite.DesignPatternComposite;

public class Product extends Global {
	private int idProduct;
	private String nomProduct;

	public Product(int idProduct, String nomProduct) {
		super();
		this.idProduct = idProduct;
		this.nomProduct = nomProduct;
		this.level=0;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getNomProduct() {
		return nomProduct;
	}

	public void setNomProduct(String nomProduct) {
		this.nomProduct = nomProduct;
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println(this.nomProduct);
	}

}
