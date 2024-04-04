public class Metodos {
    public void MetodoSeleccion(int numeros[]){
        int tamano = numeros.length;
        //System.out.println(tamano);
        for(int i =0; i<tamano-1; i++){
            //Tenemos encontrar el menor
            int index_menor= i;
            for(int j= i+1;j<tamano; j ++){
                if(numeros[j]<numeros[index_menor]){
                    index_menor=j;
                }
            }
            //Intercambiar el menor
            int aux = numeros[index_menor];
            numeros[index_menor]= numeros[i];
            numeros[i]= aux;
        }
        //Imprimir el arreglo
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i] + " - ");
        }
    }
    public void metodosClase (int numeros)
    /// Crear un metodo que resiva un arreglo de numeros y lo imprima 
}


