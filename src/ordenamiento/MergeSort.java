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
public class MergeSort {
    public long tInicio;
    public long tFinal;
    public long tTotal;

    
    public MergeSort() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
    
    public void ordenar (int[] datos){
        this.tInicio = System.currentTimeMillis();
        mS(datos);
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

    private void mS(int[] datos) {   
        int n = datos.length; 
           if(n<=1)
			return;
		int mid=n/2;
		int left[]=new int[mid];
		int right[]=new int[n-mid];
		for(int i=0;i<mid;i++)
			left[i]=datos[i];
		for(int i=mid;i<n;i++)
			right[i-mid]=datos[i];
		mS(left);
		mS(right);
		Merge(left,right,datos);
    }
    
    private void Merge(int[] left, int[] right, int[] datos){
                int nL=left.length;
		int nR=right.length;
		int i,j,k;
		i=j=k=0;
		while(i<nL&&j<nR)
		{
			if(left[i]<=right[j])
			{
				datos[k]=left[i];
				i++;
				k++;
			}
			else
			{
				datos[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<nL)
		{
			datos[k]=left[i];
			i++;
			k++;
		}
		while(j<nR)
		{
			datos[k]=right[j];
			j++;
			k++;
		}
    }
}
