package ecuaciones;

public class EcuacionLineal {

    private float x, independiente;

    public EcuacionLineal(float a, float b) {
        this.x = a;
        this.independiente = b;
    }
    public double solucion() {
        if (this.independiente == 0) {
            return 0;
        } else {
            if (this.x == 1){
                return -this.independiente;
            } else {
                return (-this.independiente)/this.x;
            }
        }
    }
}
