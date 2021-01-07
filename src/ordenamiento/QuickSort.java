/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author carli
 */
public class QuickSort {
    public long tInicio;
    public long tFinal;
    public long tTotal;

    
    public QuickSort() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
    
    public void ordenar (int[] datos){
        this.tInicio = System.currentTimeMillis();
        QS(datos, 0, datos.length - 1);
        this.tFinal = System.currentTimeMillis();
        this.tTotal = this.tFinal - this.tInicio;
    }

    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }

    private void QS(int items[], int left, int right) {   
        int i, j;
                if(items.length<=1)
			return;
		int pivot, temp;
		i = left;
		j = right;
		pivot = items [(left + right) / 2];
		
		do
			{
			while ((items [i] < pivot) && (i < right))
				{
				i++;
				}
			
			while ((pivot < items [j]) && (j > left))
				{
				j--;
				}
				
			if (i <= j)
				{
				temp = items [i];
				items [i] = items [j];
				items [j] = temp;
				i++;
				j--;
				}
			}
		while (i <= j);
		
		if (left < j)
			{
			QS (items, left, j);
			}
		
		if (i < right)
			{
			QS (items, i, right);
			}
		}
    }



