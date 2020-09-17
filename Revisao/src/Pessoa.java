public class Pessoa {
    private String nome;
    private String endereco;
    private String telephone;
    private int idade;
    private int totalCarros;
    private Carro carros[] = new Carro[5];

    public Pessoa() {

    }

    public Pessoa(String nom, int id) {
        this.nome = nom;
        this.idade = id;

    }

    public Pessoa(String nom, String tel, int id) {
        this.nome = nom;
        this.telephone = tel;
        this.idade = id;

    }

    public Pessoa(String nom, String ender, String tel, int id) {
        this.nome = nom;
        this.endereco = ender;
        this.telephone = tel;
        this.idade = id;

    }
    public void listar(){
        if(carros!=null){
            mostrar();
        }
    }
    public void mostrar() {
        System.out.println("Nome do(a) proprietario eh: " + nome);
        System.out.println("Endereco do(a) proprietario: " + endereco);
        System.out.println("Telefone do(a) proprietario: " + telephone);
        System.out.println("Idade do(a) proprietario: " + idade);
        if (carros != null) {
            for (int i = 0; i < carros.length; i++) {
                if (carros[i] != null) {
                    System.out.println("Dados do "+ (i+1)+"o carro");
                    carros[i].visualizar();
                }
            }  
        } else {
            System.out.println("Nenhum veiculo informado!");
        }
    }

    public void remover(Carro carro) {
        boolean existeCarro = false;
        int index = 0;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] == carro) {
                existeCarro = true;
                index = i;
                break;
            }
        }
        if (existeCarro) {
            for (int i = index; i < carros.length - 1; i++) {
                carros[i] = carros[i + 1];
            }
            carros[carros.length - 1] = null;
            totalCarros--;
            System.out.println("Carro do proprietário " + getNome() + " removido!");
        }
    }

    public void remover(String pla) {
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] != null && carros[i].getPlaca().equals(pla)) {
                carros[i].setPlaca(null);
                System.out.println("-------Placa removida!--------");
                break;

            }
        }
    }

    public void adicionar(Carro carro) {
        this.carros[totalCarros] = carro;
        totalCarros++;
    }

    public Carro pesquisar(String pla){
        for(int i = 0; i< carros.length;i++){
            if(carros[i]!=null && carros[i].getPlaca().equals(pla)) // equals compara string
            {
                System.out.println("Numero da placa encontrada!\nPlaca requistada: "+ pla);
                return carros[i];
            }
        }
        System.out.println("Placa não encontrada!");
        return null;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCarros(int carros) {
        this.totalCarros = carros;
    }

    public int getCarros() {
        return totalCarros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setCarro(Carro[] carro) {
        this.carros = carro;
    }

    public Carro[] getCarro() {
        return carros;
    }
    /*
     * public void removeCarro(Carro carro) { this.carros = null; }
     */
}
