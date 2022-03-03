public class Tablero {
    int casillas;
    Ficha listaFichas[] = new Ficha[4];
    public Tablero (int pcasillas){
        casillas = pcasillas;
    }

    public void crearFichas(){
        Ficha[] listarFichas = new Ficha[4];
        String[] colores = {"Celeste", "verde", "azul", "amarillo"};
        for (int i=0; i<4; i++){
            Ficha fichaActual = new Ficha(colores[i]);
            listarFichas[i] = fichaActual;
        }
        listaFichas = listarFichas; 

    }
    
        

}