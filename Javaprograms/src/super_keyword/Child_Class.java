package super_keyword;

public class Child_Class extends parent_Class {

	public Child_Class() {
		
		String surename = "more";

		System.out.println(surename);
		System.out.println(super.surename);
	}

	public static void main(String[] args) {
		String name="Vasanth";
		
		
		Child_Class CC=new Child_Class();
		CC.subchild();
		
		System.out.println(name);
	}
	public void subchild() {
		
		System.out.println(super.name);

		

	}
	

}
