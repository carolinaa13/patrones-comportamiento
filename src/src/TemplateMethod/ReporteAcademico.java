package TemplateMethod;

public abstract class ReporteAcademico {

    // Método plantilla
    public final void generarReporte() {
        generarEncabezado();
        generarContenido();
        generarSituacion();
        generarPie();
    }

    protected void generarEncabezado() {
        System.out.println("===== Reporte Académico =====");
    }

    protected void generarSituacion(){}

    // Método abstracto → lo personalizan las subclases
    protected abstract void generarContenido();

    protected void generarPie() {
        System.out.println("===== Fin del reporte =====\n");
    }
}
