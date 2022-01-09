package DesignPatternComposite.DesignPatternComposite;

import java.util.ArrayList;
import java.util.List;

public class Category extends Global {
	private int idCategory;
	private String nomCategory;
	private List<Global> Child;

	public Category(int idCategory, String nomCategory) {
		super();
		this.idCategory = idCategory;
		this.nomCategory = nomCategory;
		this.Child = new ArrayList<Global>();
		this.level = 0;

	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getNomCategory() {
		return nomCategory;
	}

	public void setNomCategory(String nomCategory) {
		this.nomCategory = nomCategory;
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println(this.nomCategory);
		if (!this.Child.isEmpty()) {
			for (int i = 0; i < this.Child.size(); i++) {
				for (int k = 0; k < this.Child.get(i).level; k++) {
					System.out.println("\t");
				}
				this.Child.get(i).view();
			}
		}
	}

	public void add(Global d) {
		this.Child.add(d);
		for (int i = 0; i < this.Child.size(); i++) {
			this.Child.get(i).level= this.level + 1;
			
			//= this.level + 1;
		}
	}

}
