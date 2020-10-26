import java.util.ArrayList;
public class Prescicao {
    private String paciente;
    private String data;
    private String medico;
    private ArrayList <Remedio> remedio = new ArrayList <Remedio>();

    public Prescicao() {
    }

    public Prescicao(String pac, String dt) {
        this.paciente = pac;
        this.data = dt;
    }

    public Prescicao(String pac, String dt, String med) {
        this.paciente = pac;
        this.data = dt;
        this.medico = med;
    }

    public void incluir(Remedio remedio) {
       this.remedio.add(remedio);
    }

    public void excluir(int codigo) {
        for(Remedio r : remedio){
            if(r.getCodigo()==codigo){
                remedio.remove(r);
                return ;
            }
        }
    }

    public Remedio buscar(String nome){
        for(Remedio r: remedio){
            if(r.getNome().equals(nome)){
                System.out.println("Remedio encontrado!");
                return r ;
            }
        }
        System.out.println("Remedio não encontrado!");
        return null;
    }

    public void imprimir() {
        System.out.println("Nome do paciente:" + this.paciente);
        System.out.println("Data de inclusão:" + this.data);
        System.out.println("Nome do medico:" + this.medico);
        for(Remedio r : remedio){
            r.imprimir();
        }
    }

    public String getData() {
        return data;
    }

    public String getMedico() {
        return medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setRemedio(ArrayList<Remedio> remedio) {
        this.remedio = remedio;
    }
    public ArrayList<Remedio> getRemedio() {
        return remedio;
    }

   

}
