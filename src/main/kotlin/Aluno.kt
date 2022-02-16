import java.time.LocalDate


class Aluno(
    var curso:String,
    var turno:String,

    //classe mae
    matricula:Short,
    endereco:String,
    nomeCompleto:String,
    email:String,
    telefone:String,

    //classe pessoa fisica
    cpf:String,
    dataDeNascimento:LocalDate,
    rg:String,
):PessoaFisica(
    matricula = matricula,
    endereco = endereco,
    nomeCompleto = nomeCompleto,
    email = email,
    telefone = telefone,
    cpf = cpf,
    dataDeNascimento = dataDeNascimento,
    rg = rg,
)