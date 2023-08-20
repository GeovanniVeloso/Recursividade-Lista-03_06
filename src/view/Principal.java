package view;

import controller.RecursivaSérie;

public class Principal {

	public static void main(String[] args) {
		RecursivaSérie rs = new RecursivaSérie();
		
		int n = 8;
		double res = rs.rserie(n);
		
		System.out.println(res);

	}

}
