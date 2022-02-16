import java.time.LocalDate

class Professor(
     var turno:String,
     var formacao:String,

     //Atributos classe mae
     salario:Float,
     cargaHorariaDiaria:Byte,
     matricula:Short,
     telefone:String,
     email:String,
     endereco:String,
     //Atributo classe pessoa fisica
     nomeCompleto:String,
     cpf:String,
     dataDeNascimento:LocalDate,
     rg:String,
):Funcionario(
    matricula = matricula,
    telefone = telefone,
    email = email,
    endereco = endereco,
    salario = salario,
    cargaHorariaDiaria = cargaHorariaDiaria,
    nomeCompleto = nomeCompleto,
    cpf = cpf,
    dataDeNascimento = dataDeNascimento,
    rg = rg
)