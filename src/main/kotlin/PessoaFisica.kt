import java.time.LocalDate

open class PessoaFisica(
   var nomeCompleto:String,
   var cpf:String,
   var dataDeNascimento:LocalDate,
   var rg:String,
    //atributos da classe mae
   matricula:Short,
   email:String,
   telefone:String,
   endereco:String
): Pessoa(
    matricula = matricula,
    email = email,
    telefone = telefone,
    endereco = endereco
)