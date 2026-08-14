public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Distancia al origen (0,0)
    public double distanciaAlOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    // Distancia a otro punto
    public double distanciaA(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Desplazar el punto
    public void desplazar(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto(6, 8);

        System.out.println("Punto 1: " + p1);
        System.out.println("Punto 2: " + p2);

        System.out.println("Distancia de p1 al origen: " + p1.distanciaAlOrigen());
        System.out.println("Distancia entre p1 y p2: " + p1.distanciaA(p2));

        // Desplazamos p1
        p1.desplazar(2, -1);
        System.out.println("\nP1 desplazado: " + p1);

        // Recalculamos
        System.out.println("Nueva distancia de p1 al origen: " + p1.distanciaAlOrigen());
        System.out.println("Nueva distancia entre p1 y p2: " + p1.distanciaA(p2));
    }
}

