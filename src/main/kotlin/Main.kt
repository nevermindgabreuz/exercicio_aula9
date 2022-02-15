import java.time.LocalDate

fun main(args: Array<String>) {
    val qi = PessoaJuridica(
       nomeFantasia = "QI Escolas e Faculdades",
       razaoSocial = "QI Escolas e Faculdades LTDA.",
       endereco = "Assis Brasil 3423 - Porto Alegre/RS",
       matricula = 23,
       cnoj = "1234567890/5678",
       dataDeFundacao = LocalDate.now(),
       telefone = "(51) 3041-0001",
       email = "fl02@qi.edu.br"
    )

    println(qi.matricula)

    val gabriel = PessoaFisica(
        nomeCompleto = "Gabriel Pastel",
        cpf = "0000",
        rg = "2345678",
        matricula = 22,
        dataDeNascimento = LocalDate.of(2000,6,19),
        email = "gabrielpastel@gmail.com",
        telefone = "(51)30249343",
        endereco = "Rua A n° 22 - Porto Alegre/RS"
    )
    println(gabriel.matricula)
}