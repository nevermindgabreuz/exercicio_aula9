import java.time.LocalDate

class PessoaJuridica(
    var cnoj:String,
    var dataDeFundacao:LocalDate,
    var razaoSocial:String,
    var nomeFantasia:String,

    //propriedades classe mae
    matricula:Short,
    endereco:String,
    email:String,
    telefone:String
):Pessoa(
    matricula = matricula,
    endereco = endereco,
    email = email,
    telefone = telefone
)