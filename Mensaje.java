public class Mensaje {
    private String origen;
    private String destino;
    private String contenido;
    private String camino;

    public Mensaje(String origen, String destino, String contenido, String camino) {
        this.origen = origen;
        this.destino = destino;
        this.contenido = contenido;
        this.camino = camino;
    }

    public static Mensaje crearMensajeDesdeTexto(String texto) {
        String[] partes = texto.split(";");
        if (partes.length < 4) throw new IllegalArgumentException("Mensaje mal formado: " + texto);
        return new Mensaje(partes[0], partes[1], partes[2], partes[3]);
    }

    public String pasarMensajeATexto() {
        return origen + ";" + destino + ";" + contenido + ";" + camino;
    }

    public void agregarAlCamino(String nodo) {
        this.camino += " -> " + nodo;
    }

    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public String getContenido() { return contenido; }
    public String getCamino() { return camino; }
}
