package app;

public class Cliente {
private String nome;
private String cpf;
private String email;

public Cliente (){
    
}
    public Cliente (String nome){
        this.email = nome;
    }
    public Cliente (String email,String cpf){
        this.email = email;
        this.cpf =  cpf;
    }
    public Cliente (String email,String cpf, String nome ){
        this.email = email;
        this.cpf =  cpf;
        this.nome = nome;
    }

    public void setNome(String nome){
      this.nome =  nome;
    }
    public String getNome(){
        return this.nome;
      }
      public void setCpf(String cpf){
        this.cpf = cpf;
      }
      public String getCpf(){
          return this.cpf;
        }
        public void setEmail(String email){
            this.cpf = email;
          }
          public String getEmail(){
              return this.email;
            }  

         @Override
         public String toString(){
         return "O nome da pessoa é: " + this.nome + "\n" + "\n" + " cpf: " + this.cpf+"O email: " + this.email ;
        }

    }

