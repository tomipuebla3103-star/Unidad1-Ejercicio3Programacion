//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    EstudianteUniversitario estudiante1 =
            new EstudianteUniversitario("001", "Juan Perez", 8.5);

    EstudianteUniversitario estudiante2 =
            new EstudianteUniversitario("002", "Maria Lopez", 5.0);

    System.out.println(estudiante1.getNombreCompleto() + ": "
            + estudiante1.estaAprobado());

    System.out.println(estudiante2.getNombreCompleto() + ": "
            + estudiante2.estaAprobado());
}
