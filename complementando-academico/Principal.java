public class Principal
{
    public static void main(String[] args)
    {
        PersistenciaComSerializacao arq = new PersistenciaComSerializacao();
        
        ListaComEncadeamento<Pessoa> osAlunosDaUniversidade = arq.recuperaAlunos() ;
        ListaComArray<Curso> osCursosDaUniversidade = arq.recuperaCursos() ;
        ListaComEncadeamento<Disciplina> asDisciplinasDaUniversidade = arq.recuperaDisciplinas() ;
        
        InterfaceDeUsuario ui = new InterfaceDeUsuario( osAlunosDaUniversidade,osCursosDaUniversidade,asDisciplinasDaUniversidade );        
        ui.menuPrincipal();
    }
}
