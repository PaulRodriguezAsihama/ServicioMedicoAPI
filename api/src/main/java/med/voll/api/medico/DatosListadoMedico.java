package med.voll.api.medico;

public record DatosListadoMedico(
       String Nombre,
       String especialidad,
       String documento,
       String email) {

    public DatosListadoMedico(Medico medico){
        this(medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(), medico.getEmail());
    }
}
