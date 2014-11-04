/*
 * ANÁLISIS DE ALGORITMOS
 * ALGORITMO GENETICO DE ORDENAMIENTO DE ARREGLOS NUMÉRICOS
 * INSTITUTO TECNOLOGICO DE COSTA RICA
 * ESTUDIANTE DANIEL MONTOYA AGUILAR
 * CARNET 201106385
 * 
 * */


package algoritmosGeneticos;

public class algoritmosGeneticos {

	public void bubble(int [] a) {
		 int i, j, temp;
		 // recorre el array n-1 veces
		 for (i=1; i<a.length; i++) {
		 // recorre todos los elementos
		 for(j=0; j<a.length-1; j++) {
		 // compara cada par de elementos consecutivos
		 if (a[j] > a[j+1]) {
		 // si están desordenados los intercambia
		 temp = a[j];
		 a[j]= a[j+1];
		 a[j+1]= temp;
		 }
		 } // for j
		 } // for i
		}
	
	public void imprimir(int [] a){
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			
		}
	
	}
	
	
	
public static void main(String args[])
{
	algoritmosGeneticos algoritmos= new algoritmosGeneticos();
	int arreglo[]={5,4,10,2,1,9};
	algoritmos.imprimir(arreglo);
	System.out.println();
	algoritmos.bubble(arreglo);
	algoritmos.imprimir(arreglo);
	
}



}
