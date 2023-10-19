public class PlacaBase {

    private Integer id;
    private String marca;
    private String modelo;
    private Double precio;
    private String graficaInstalada;
    private String audio;
    private String zocalos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getGraficaInstalada() {
        return graficaInstalada;
    }

    public void setGraficaInstalada(String graficaInstalada) {
        this.graficaInstalada = graficaInstalada;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getZocalos() {
        return zocalos;
    }

    public void setZocalos(String zocalos) {
        this.zocalos = zocalos;
    }
}
