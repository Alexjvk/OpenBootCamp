package ejercicios.tema3;

public class SegundaParte {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumarPuertas();

        System.out.println(miCoche.puertas);
    }
}
class Coche {
    public int puertas = 4;
        public void SumarPuertas (){
            this.puertas++;
        }
    }