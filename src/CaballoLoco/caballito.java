/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaballoLoco;

/**
 *
 * @author carli
 */
public class caballito {
    public int [][] tablero;
    //Movimientos legales
    public int X[]={-2,-1,1,2,2,1,-1,-2}; 
    public int Y[]={1,2,2,1,-1,-2,-2,-1};  
    int px,py;
    boolean exito=true;
    
    
    public caballito(int px, int py){
        this.tablero=new int[8][8];
        this.px = px;
        this.py = py;
    }
    
    public void resolver(){
        int pxaux=0, pyaux=0;
        int cont=1;
        int posi=0;
        
        int aux=0;
        
        this.tablero[px][py]=cont;
        do{
            pxaux=px;
            pyaux=py;
            
            for(int i=0; i<8; i++){
                if(validar(px, py, X[i], Y[i])==1){
                    for(int j=0; j<8; j++){
                        aux+=validar(px+X[i], py+Y[i], X[j], Y[j]);
                    }
                    if ((aux>posi && aux!=0)){
                        pxaux=px+X[i];
                        pyaux=py+Y[i];
                        posi=aux;
                    }else if(aux == 0 && posi == 0){
                        pxaux=px+X[i];
                        pyaux=py+Y[i];
                    }
                    aux=0;
                }
            }
            if(posi==0){
                exito=false;
            }
                cont++;
                this.tablero[pxaux][pyaux]=cont;
                px=pxaux;
                py=pyaux;
                posi = 0;           
        }while((exito==true) && cont!=64);
         imprimirTablero();   
    }
    public int validar(int px, int py, int x, int y){
        if(((px+x)>=0 && (px+x)<=7) && ((py+y)>=0 && (py+y)<=7)){
            if(tablero[px+x][py+y]==0){
                return 1;
            }
            else{
                return 0; 
            }
        }
        else{
            return 0; 
        }
    }
    public void imprimirTablero (){
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                System.out.print(""+tablero[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
