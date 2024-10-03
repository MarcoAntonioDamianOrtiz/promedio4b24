public class estudiante {

    private String matricula;
    private String nombre;
    private double estructuras;
    private double evaluacion;
    private double ingles;
    private double promedio;

    //construrtor
    //set agregar
    //getters consultar
    public estudiante(String m, String n) {
        //El objetivo es construir e inicializar el objeto
        this.matricula = m;
        this.nombre = n;
    }
    // Getters y Setters 

    // get metodos consultor
    public String getMatricula() {
        return matricula;
    }

    // Set metodo constructor
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstructuras() {
        return estructuras;
    }

    public void setEstructuras(double estructuras) {
        this.estructuras = estructuras;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio() {
        this.promedio = (this.estructuras + this.evaluacion + this.ingles) /3;
    }

    @Override // es para sobrescribir sobre un objeto y se adapta
    //object es la clase principal  de java, estudiante hereda la de object que esd una super clase
    public String toString() {
        return "Estudiante [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }
    
}