package controller;

public class RecursivaSérie {
	public RecursivaSérie() {
		super();
	}
	/*Explicação: Recebe um valor n que se torna o limite da série.
	 * Quando n se torna igual a 1, a função retorna 1, o somando com os resultados posteriores.
	 * Tem como chamada da função n - 1, chamando assim o valor anterior da série.
	 * Chama também uma segunda função recursiva que calcula o fatorial do termo n atual.
	 * Tem como condição de parada quando n é igual ou menor que 1 retornando 1, sendo a base da soma da série.
	 */
	public double rserie(int n) {
			if ( n <= 1){
			return 1;}
			else{
				return (double)(1.0/(Fat(n)))+rserie(n-1);
			}
	}
	
	public int Fat(int n){
		if ( n == 1 ){
			return 1;
		}else{
			int fat = Fat(n-1) * n;
			return fat;
		}
	}
}
