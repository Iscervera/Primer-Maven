package ecuaciones;

public class EcuacionCuadratica {
    private float a, b, c;

    public EcuacionCuadratica(float x2, float x, float independiente) {
        this.a = x2;
        this.b = x;
        this.c = independiente;
    }
    public float[] solucion() {
        float[] resultado = new float[2];
        double discriminante = Math.pow(this.b, 2) - 4*this.a*this.c;
        if(discriminante < 0) {
            throw new IllegalArgumentException();
        } else if (discriminante > 0) {
            resultado[0] = (float)(-this.b + Math.sqrt(discriminante))/(2*this.a);
            resultado[1] = (float)(-this.b - Math.sqrt(discriminante))/(2*this.a);
        } else {
            resultado[0] = (-this.b)/2*this.a;
            resultado[1] = (-this.b)/2*this.a;
        }
        return resultado;
    }
}
