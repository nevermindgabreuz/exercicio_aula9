import java.time.LocalDate

open class Funcionario (
        var salario:Float,
        var cargaHorariaDiaria:Byte,
        //infos do classe mae
        matricula:Short,
        endereco:String,
        telefone:String,
        email:String,
        cpf:String,
        rg:String,
        nomeCompleto:String,
        dataDeNascimento:LocalDate
):PessoaFisica(
        matricula = matricula,
        nomeCompleto = nomeCompleto,
        cpf = cpf,
        rg = rg,
        email = email,
        endereco = endereco,
        dataDeNascimento = dataDeNascimento,
        telefone = telefone
){

}