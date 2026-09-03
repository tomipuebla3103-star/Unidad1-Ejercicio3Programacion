public class EstudianteUniversitario {
    private String legajo;
    private String nombreCompleto;
    private double calificacionFinal;

    public EstudianteUniversitario(String legajo, String nombreCompleto, double calificacionFinal) {
        this.legajo = legajo;
        this.nombreCompleto = nombreCompleto;
        setCalificacionFinal(calificacionFinal);
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setCalificacionFinal(double calificacionFinal) {
        if (calificacionFinal >= 0 && calificacionFinal <= 10) {
            this.calificacionFinal = calificacionFinal;
        } else {
            this.calificacionFinal = 0;
        }
    }

    public boolean estaAprobado() {
        return calificacionFinal >= 6.0;
    }
}
