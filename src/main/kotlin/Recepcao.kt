import java.time.*

class Recepcao(
    var turno:String,
    var sala:Byte,

    //Atributos classe mae
    salario:Float,
    cargaHorariaDiaria:Byte,
    matricula:Short,

    //Atributos classe pessoa fisica
    nomeCompleto:String,
    cpf:String,
    dataDeNascimento:LocalDate,
    rg:String,
    endereco:String,
    telefone:String,
    email:String,
):Funcionario(
    matricula = matricula,
    salario = salario,
    cargaHorariaDiaria = cargaHorariaDiaria,
    nomeCompleto = nomeCompleto,
    cpf = cpf,
    dataDeNascimento = dataDeNascimento,
    rg = rg,
    endereco = endereco,
    telefone = telefone,
    email = email,
)